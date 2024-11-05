
public class SpacedLogger implements Logger {
   // Q5. Implement the SpacedLogger methods:
   //Note:  The SpacedLogger should add a space or " " between each character of the
   //String argument passed into its methods.

    
    public void log(String message) {
        System.out.println(addSpaces(message));
    }
    
    //Q5a. If the log method received “Hello” as an argument, it should print H e l l o

    public void error(String message) {
        System.err.println(addSpaces(message));
    }

    //Q5b b. The error method should do the same, but with “ERROR:” preceding the spaced out 
    // input (i.e. ERROR: H e l l o)
    private String addSpaces(String message) {
        return message.replaceAll(".", "$0 ").trim(); // Adds a space to Hello
    }
}
