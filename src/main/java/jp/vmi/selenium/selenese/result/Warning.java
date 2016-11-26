package jp.vmi.selenium.selenese.result;

/**
 * Result of warning.
 */
public class Warning extends Result {

    /**
     * Constructor.
     *
     * @param message warning message.
     */
    public Warning(String message) {
        super("Warning", message);
    }

    /**
     * Constructor.
     *
     * @param message warning message.
     * @param e Exception.
     */
    public Warning(String message, Exception e) {
        super("Warning", message, e);
    }

    @Override
    public Level getLevel() {
        return Level.WARNING;
    }
}
