[![Build Status](https://travis-ci.com/StratfordHS-APCS/lab-03-stringsloopslab-username.svg?token=L8ZuTUsXtxKqevAPVWLC&branch=master)](https://travis-ci.com/StratfordHS-APCS/lab-03-stringsloopslab-username)

# Lab 03 -Strings and Loops Lab

## Lab Goal
This lab was designed to give you a chance to practice using ```while``` loops, ```for``` loops, and nested loops.  You will also get practice using strings, characters, and basic lists.

## Instructions
The ```main()``` method should:
* start a scanner to read from the keyboard.
* use a loop to allow the user to continue to enter sentences until they enter exactly "done".
* inside this loop prompt for and read the user's input, call ```sentenceStats()```, then call ```upCaseWord()```, and print a single blank line at the end of the loop as padding before the next loop prompts the user for input.

The ```upCaseWord()``` method should look at the sentence the user entered and if any of the words in the ```words``` array are present replace them with an all caps version of the word.  Be careful, you might think you can just user String.replaceAll(), but if you use that to replace all instances if "is" with "IS" it will also replace "this" with "thIS" which is not what you want.  After doing all necessary replacements print the new sentence to the console.

Examples:
This is Stratford.   -->    This IS STRATFORD.
you and yours        -->    YOU AND yours
Stratford stratford Stratford   -->    STRATFORD stratford Stratford

The ```sentenceStats()``` method should look at the original sentence and find and print the following:
* the total number of characters
* the total number of words
* the total number of letters
* the total number of lower case letters
* the total number of upper case letters

## Sample Output
```
Enter a sentence: This is Stratford!
Number of characters: 18
Number of words: 3
Number of Letters: 15
Number of lower case: 13
Number of upper case: 2
This IS STRATFORD!

Enter a sentence: done
```

## Helpful Information
* A list of all Java String functions can be found at https://docs.oracle.com/javase/8/docs/api/java/lang/String.html
* A list of all Java Character functions can be found at https://docs.oracle.com/javase/8/docs/api/java/lang/Character.html
* Things I found useful (you can look up how to use these):
  * String.toLowerCase()
  * String.toUpperCase()
  * String.substring()
  * String.charAt()
  * Character.isLetterOrDigit()
  * String.trim()
  * String.split()
  * Character.isLowerCase()
  * Character.isUpperCase()
* Don't forget you can't compare strings using ```==```.  You must use String.equals().

## Relevant ThinkJava Sections
* [The While Statement](http://greenteapress.com/thinkjava6/html/thinkjava6008.html#sec82)
* [The For Statement](http://greenteapress.com/thinkjava6/html/thinkjava6008.html#sec86)
* [Accessing Array Elements](http://greenteapress.com/thinkjava6/html/thinkjava6009.html#sec93)
* [Array Length](http://greenteapress.com/thinkjava6/html/thinkjava6009.html#sec96)
* [Strings and Things](http://greenteapress.com/thinkjava6/html/thinkjava6010.html)

## Notes
* Checkstyle config link is http://www.daveavis.com/cs/checkstyle_SHS.xml
* After cloning your repo from GitHub you can open your code in BlueJ by double clicking on the **package** file.

## Grading
* 20 - main()
* 40 - upCaseWord()
* 30 - sentenceStats()
* 10 - style

Note that these are potential maximums; the computer can only check so much.  If your code passes checkstyle, but I see non-descriptive variable names, then your style grade will go down.  If your code passes all tests, but I see code that was copied off of the internet or from another student your grade will go *way* down.
