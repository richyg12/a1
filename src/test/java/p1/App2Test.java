package p1;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class App2Test 
    extends TestCase
{
    /***
     * Create the test case
     *
     * @param testName name of the test case
     */
    public App2Test( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( App2Test.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	System.out.println("i am a failure");
       assertTrue( (1 == 1)  );
    }
    public void testApp1()
    {
    	System.out.println("i am a failure also");
       assertTrue( (1 == 1)  );
    }
}
