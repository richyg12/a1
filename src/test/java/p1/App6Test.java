package p1;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class App6Test 
    extends TestCase
{
    /***
     * Create the test case
     *
     * @param testName name of the test case
     */
    public App6Test( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( App6Test.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	System.out.println("HELLO EMMA I AM TEST 6 - DID I PASS");
    	assertTrue( true );
    }
}
