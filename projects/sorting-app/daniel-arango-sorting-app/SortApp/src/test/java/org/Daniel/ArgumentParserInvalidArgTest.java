package org.Daniel;


import org.Daniel.ArgumentParser.ArgumentParser;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

@RunWith(Parameterized.class)
public class ArgumentParserInvalidArgTest
{
    private final CSVRecord testValue;
    static private final String EXPECTED_HEADER = "expectedErrorMessage";
    static private final String ARGS_HEADER = "args";
    static private final String CSV_PATH = "src/test/resources/invalidArgs.csv";

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    public ArgumentParserInvalidArgTest(CSVRecord testValue){
        this.testValue = testValue;
    }

    @Test
    public void testInvalidArgs()
    {
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage(testValue.get(EXPECTED_HEADER));

        ArgumentParser parser = new ArgumentParser(testValue.get(ARGS_HEADER).split(" "));
        parser.printSortedArguments();
    }

    @Parameterized.Parameters
    public static Iterable<CSVRecord> parameters() throws IOException {
        Reader file = new FileReader(CSV_PATH);
        return CSVFormat
                .DEFAULT
                .withHeader(String.format("%s,%s", ARGS_HEADER, EXPECTED_HEADER))
                .withFirstRecordAsHeader()
                .parse(file);
    }
}