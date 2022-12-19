package org.Daniel;

import org.Daniel.ArgumentParser.ArgumentParser;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.junit.Assert.assertEquals;

public class ArgumentParserNoArgTest
{
    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    public void testZeroArgs()
    {
        String[] args = {};
        ArgumentParser parser = new ArgumentParser(args);
        parser.printSortedArguments();
        assertEquals("[]", systemOutRule.getLog().trim());
    }
}