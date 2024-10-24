

public class wJ5
public class App
public class SpacedLogger
public class AsteriskLogger
{
    public static void main(String[] args) {
   //Q1      Create an interface named Logger.
   
   public interface Logger {
    
   
   //Q2 Add two void methods to the Logger interface, each should take a String as an argument

    //  a.  log

    // b.  error
    
    void logInfo(String message);
    void logError(String message);
    
    
    //Q3 3.     Create two classes that implement the Logger interface

    // a.  AsteriskLogger

    // b.  SpacedLogger
    
    //Q4 4.  Implement the AsteriskLogger methods:  

    // Note:  The AsteriskLogger will use the asterisk or "*".

    // a.  The log method on the AsteriskLogger should print out the String it receives 
    // between 3 asterisks on either side of the String (e.g. if the String passed in is “Hello”, 
    //then it should print ***Hello*** to the console).

    // b. The error method on the AsteriskLogger should print the String it receives inside
    //a box of asterisks, with the String preceded by the word “ERROR:”. For example, if “Hello” is
    //the argument, the following should be printed:

    // ****************

    // ***Error: Hello***

    // ****************
    
    //Q5  5. Implement the SpacedLogger methods:

    // Note:  The SpacedLogger should add a space or " " between each character of the String argument
    // passed into its methods.
    
    // a.  // If the log method received “Hello” as an argument, it should print H e l l o

    // b.  // The error method should do the same, but with “ERROR:” preceding the spaced out input (i.e. ERROR: H e l l o)
    
    //Q 6.     Create a class named App that has a main method.

    // a.  In this class instantiate an instance of each of your logger classes that implement the Logger interface.

    // b. Test both methods on both instances, passing in Strings of your choice
    



}
