public class App {
    public static void main(String[] args) {
        Logger asteriskLogger = new AsteriskLogger();
        Logger spacedLogger = new SpacedLogger();

        System.out.println("Using AsteriskLogger:");
        asteriskLogger.logInfo("This is an info message.");
        asteriskLogger.logWarning("This is a warning message.");
        asteriskLogger.logError("This is an error message.");
        asteriskLogger.logDebug("This is a debug message.");

        System.out.println("\nUsing SpacedLogger:");
        spacedLogger.logInfo("This is an info message.");
        spacedLogger.logWarning("This is a warning message.");
        spacedLogger.logError("This is an error message.");
        spacedLogger.logDebug("This is a debug message.");
    }
}