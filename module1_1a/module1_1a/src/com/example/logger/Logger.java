package com.example.logger;

public class Logger {
	 private static Logger instance;
	    
	    private Logger() {
	        // Initialize any resources, if needed
	    }
	    
	    public static Logger getInstance() {
	        if (instance == null) {
	            synchronized (Logger.class) {
	                if (instance == null) {
	                    instance = new Logger();
	                }
	            }
	        }
	        return instance;
	    }
	    
	    public void log(String message) {
	        System.out.println("Log: " + message);
	    }
	}

