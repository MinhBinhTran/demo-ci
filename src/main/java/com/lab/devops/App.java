
package com.lab.devops;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Main application for the CI demonstration. */
public class App {

    private static final Logger logger =
            LoggerFactory.getLogger(App.class);

    /**
     * Starts the application.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        logger.info("Starting Application...");
        int result = add(5, 10);
        logger.info("Result is: {}", result);
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
