/**
 * String Checker reads a string from the console, outputs various
 * statistics about it, and capitalizes words that are in a list.
 * 
 * @author (name)
 * @version (date)
 */
public class StringChecker
{   
    public static void main( String[] args )
    {
        // start a scanner to read from the keyboard
        
        // make a loop that allows the user to enter sentences until they enter "done"
        // Inside the loop, prompt for and read the user's input, call sentenceStats(), 
        //   then call upCaseWord(), print a single blank line as padding before the next loop asks for more input.   
    }
    
    /**
     * Capitalizes words in the string if they are in the provided list.
     * 
     * @param   sentence    The sentence to be parsed.
     */
    private static void upCaseWord( String sentence )
    {
        
        String[] words = { "Stratford", "you", "and", "is" }; // don't change this list of words.  These are the words to make ALL CAPS.
        
        // you might think this is as simple as using String.replaceAll(), 
        //but if you're trying to replace "is" with "IS" you will change "this" to "thIS".
        
        System.out.println( sentence );
    }
    
    /**
     * Gathers and outputs statistics about the sentence provided.
     * 
     * @param   sentence    The sentence to gather statistics for.
     */
    private static void sentenceStats( String sentence )
    {
        // number of characters
        // number of words
        // number of letters
        // number of capital letters
        // number of lower case letters
        System.out.println( "Number of characters: " + numChars );
        System.out.println( "Number of words: " + numWords );
        System.out.println( "Number of Letters: " + numLetters );
        System.out.println( "Number of lower case: " + numLowerCase);
        System.out.println( "Number of upper case: " + numUpCase);
    }
}