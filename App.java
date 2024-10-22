
    //Q6 6.  Create a class named App that has a main method.
    // a.  In this class instantiate an instance of each of your logger classes that implement the Logger interface.
    //b. Test both methods on both instances, passing in Strings of your choice

public class App {
    public static void main(String[] args) {
        Logger asteriskLogger = new AsteriskLogger();
        asteriskLogger.log("Greeting Professor Falken");
        asteriskLogger.error("Would prefer a nice game of chess");

        Logger spacedLogger = new SpacedLogger();
        spacedLogger.log("No longer can reach youat your new address");
        spacedLogger.error("Classified Address");
    }
}