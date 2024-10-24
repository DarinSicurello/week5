    // Q4.  Implement the AsteriskLogger methods:  
    //Note:  The AsteriskLogger will use the asterisk or "*".


    public class AsteriskLogger implements Logger {
       public void log(String message) {
        System.out.println("*** " + message + " ***");
    }

    //Q4a.  The log method on the AsteriskLogger should print out the String it receives between 3 asterisks on either
    //side of the String (e.g. if the String passed in is “Hello”, then it should print ***Hello*** to the console).
    
    public void error(String message) {
        System.err.println("************************************");
        System.err.println("*** " + "Error:" + message + " ***");
        System.err.println("************************************");
    }
    
    //Q4b. The error method on the AsteriskLogger should print the String it receives inside a box of asterisks,
    //with the String preceded by the word “ERROR:”. For example, if “Hello” is the argument, the following should
    //be printed:
    //****************
    //***Error: Hello***

}



    
