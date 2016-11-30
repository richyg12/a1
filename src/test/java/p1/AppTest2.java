package p1;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest2 
    extends TestCase
{
    /***
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest2( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest2.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	System.out.println("HELLO I AM APPTEST2 FROM THE INSIDE");
    	System.out.println("HELLO I AM APPTEST2 THE PI");
    	System.out.println("HELLO I AM APPTEST2 THE OTHERSIDE");
       assertTrue( true );
    }
}
