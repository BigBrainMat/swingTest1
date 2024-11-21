package com.github.bigbrainmat.swingtest1;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class SwingTest1Test
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public SwingTest1Test( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( SwingTest1Test.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
