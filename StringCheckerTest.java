import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.InputStream;

/**
 * The test class StringCheckerTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StringCheckerTest
{
    /**
     * Default constructor for test class StringCheckerTest.
     */
    public StringCheckerTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    /**
     * Tests the main method with fixed input.
     */
    @Test
    public void testMain()
    {
        //Prepare to redirect output
        InputStream origIn =  System.in;
        PrintStream origOut = System.out;

        //OutputStream os = new ByteArrayOutputStream();
        //PrintStream ps = new PrintStream(os);
        //System.setOut(ps);
        String ls = System.getProperty("line.separator");  // use instead of \n

        //Prepare to redirect input
        String[] inputString = {"This is Stratford!\ndone\n",
                                "Stratford stratford Stratford\ndone\n",
                                "My favorite color is green.\ndone\n", 
                                "And and stuff 'n' thangs.\ndone\n" };   // can include line seperators for multiline input
        
        String[] expected = {   "Enter a sentence: "
                                + "Number of characters: 18" + ls
                                + "Number of words: 3" + ls
                                + "Number of Letters: 15" + ls
                                + "Number of lower case: 13" + ls
                                + "Number of upper case: 2" + ls
                                + "This IS STRATFORD!" + ls
                                + ls
                                + "Enter a sentence: " + ls,
                        
                                "Enter a sentence: "
                                + "Number of characters: 29" + ls
                                + "Number of words: 3" + ls
                                + "Number of Letters: 27" + ls
                                + "Number of lower case: 25" + ls
                                + "Number of upper case: 2" + ls
                                + "STRATFORD stratford STRATFORD" + ls
                                + ls
                                + "Enter a sentence: " + ls,
                            
                                "Enter a sentence: "
                                + "Number of characters: 27" + ls
                                + "Number of words: 5" + ls
                                + "Number of Letters: 22" + ls
                                + "Number of lower case: 21" + ls
                                + "Number of upper case: 1" + ls
                                + "My favorite color IS green." + ls
                                + ls
                                + "Enter a sentence: " + ls,
                            
                                "Enter a sentence: "
                                + "Number of characters: 25" + ls
                                + "Number of words: 5" + ls
                                + "Number of Letters: 18" + ls
                                + "Number of lower case: 17" + ls
                                + "Number of upper case: 1" + ls
                                + "And AND stuff 'n' thangs." + ls
                                + ls
                                + "Enter a sentence: " + ls };
        
        for( int i = 0; i < inputString.length; i++ )
        {
            OutputStream os = new ByteArrayOutputStream();
            PrintStream ps = new PrintStream(os);
            System.setOut(ps);
        
            ByteArrayInputStream in = new ByteArrayInputStream(inputString[i].getBytes() );
            System.setIn( in );
    
            String[] args = {};
            StringChecker.main(args);
    
            String outString = os.toString();
            String result = outString;  // or substring or whatever manipulation you want
    
                            
            assertEquals( "Incorrect output: ", expected[i], result);
        }
        //Reset input and output
        System.setOut( origOut );
        System.setIn( origIn );
    }
}