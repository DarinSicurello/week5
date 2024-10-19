

public class AsteriskLogger implements Logger {

    //@Override
    public void logInfo(String message) {
        log(message);
    }

    //@Override
    public void logWarning(String message) {
        log(message);
    }

    //@Override
    public void logError(String message) {
        log(message);
    }

    //@Override
    public void logDebug(String message) {
        log(message);
    }

    private void log(String message) {
        System.out.println("*** " + message + " ***");
    }
}

    
