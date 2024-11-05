    // Q1.Create an interface named Logger.
    //Q2. Add two void methods to the Logger interface, each should take a String as an argument
    //      a.  log
    //      b.  error


public interface Logger {
    
    void log(String message);
    void error(String message);
}


    //Q3 Create two classes that implement the Logger interface
    //  a.  AsteriskLogger
    //  b.  SpacedLogger
