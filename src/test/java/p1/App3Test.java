package p1;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class App3Test 
    extends TestCase
{
    /***
     * Create the test case
     *
     * @param testName name of the test case
     */
    public App3Test( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( App3Test.class );
    }

    /**
     * Rigourous Test :-)
     */
    //@Ignore
    public void testApp1()
    {
    	int i = 1;
    	
    	System.out.println("I AM TEST 1 DID I RUN ?");
       assertTrue( i == 1  );
    }
    
    public void testApp2()
    {
    	int i = 2;
    	
    	System.out.println("I AM TEST 2 DID I RUN ?");
       assertTrue( i == 2  );
    }
}
