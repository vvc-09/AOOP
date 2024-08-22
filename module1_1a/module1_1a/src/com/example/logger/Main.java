package com.example.logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        
        logger.log("Starting the application...");
        logger.log("Processing data...");
        logger.log("Application finished successfully.");
        
        Logger anotherLogger = Logger.getInstance();
        if (logger == anotherLogger) {
            System.out.println("Same logger instance is used throughout the application.");
        } else {
            System.out.println("Different logger instances exist, which should not happen.");
        }
    }
}