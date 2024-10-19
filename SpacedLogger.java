
public class SpacedLogger implements Logger {

    @Override
    public void logInfo(String message) {
        log(message);
    }

    @Override
    public void logWarning(String message) {
        log(message);
    }

    @Override
    public void logError(String message) {
        log(message);
    }

    @Override
    public void logDebug(String message) {
        log(message);
    }

    private void log(String message) {
        String spacedMessage = addSpaces(message);
        System.out.println(spacedMessage);
    }

    private String addSpaces(String message) {
        return message.replaceAll("", " ").trim();
    }
}
