package org.Daniel;


import org.Daniel.ArgumentParser.ArgumentParser;
import static org.junit.Assert.assertEquals;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

@RunWith(Parameterized.class)
public class ArgumentParserValidArgTest
{
    private final CSVRecord testValue;
    static private final String EXPECTED_HEADER = "expected";
    static private final String ARGS_HEADER = "args";
    static private final String CSV_PATH = "src/test/resources/validArgs.csv";

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    public ArgumentParserValidArgTest(CSVRecord testValue){
        this.testValue = testValue;
    }

    @Test
    public void testValidArgs()
    {
        ArgumentParser parser = new ArgumentParser(testValue.get(ARGS_HEADER).split(" "));
        parser.printSortedArguments();
        assertEquals(testValue.get(EXPECTED_HEADER), systemOutRule.getLog().trim());
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
