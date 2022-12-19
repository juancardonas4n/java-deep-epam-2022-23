package org.Daniel;

import org.Daniel.ArgumentParser.ArgumentParser;

/**
 * SortingApp main class
 */
public class App
{
    /**
     * SortingApp main method.
     * @param args All arguments should be the String format of a valid Java integer
     */
    public static void main( String[] args )
    {
        ArgumentParser parser = new ArgumentParser(args);
        parser.printSortedArguments();
    }
}
