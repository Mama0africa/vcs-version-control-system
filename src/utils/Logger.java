package utils;

import cli.SwingCLI;
import com.sun.tools.javac.Main;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Observable;

public class Logger {
    private String className;


    public Logger(Class<?> clazz) {
        this.className = clazz.getSimpleName();
    }

    private void log(String level, String message) {
        String timestamp = new SimpleDateFormat(Timestamp.DATE_FORMAT).format(new Date());
        String logOut = timestamp + " [" + level + "] " + this.className + ": " + message;

        // Prints log
        System.out.println(logOut);
        SwingCLI.getSwingCLIWithIndex(0).setOutputTextArea(logOut);
    }



    /**
     * Logs a trace-level message.
     *
     * @param message the message to be logged
     */
    public void trace(String message) {
        log("TRACE", message);
    }

    /**
     * Logs a debug-level message.
     *
     * @param message the message to be logged
     */
    public void debug(String message) {
        log("DEBUG", message);
    }

    /**
     * Logs an informational message.
     *
     * @param message the message to be logged
     */
    public void info(String message) {
        log("INFO", message);
    }

    /**
     * Logs a warning-level message.
     *
     * @param message the message to be logged
     */
    public void warning(String message) {
        log("WARNING", message);
    }

    /**
     * Logs an error-level message.
     *
     * @param message the message to be logged
     */
    public void error(String message) {
        log("ERROR", message);
    }

    /**
     * Logs a fatal-level message.
     *
     * @param message the message to be logged
     */
    public void fatal(String message) {
        log("FATAL", message);
    }
}

