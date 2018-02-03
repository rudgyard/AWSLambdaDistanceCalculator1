package com.rudgyard.lambda.utilities;

import java.util.ArrayList;

import com.amazonaws.services.lambda.runtime.LambdaLogger;

public class Logger {
	
	private static LambdaLogger logger;
	
	private static ArrayList<String> buffer = new ArrayList<String>();
	
    static void log(String string) {
		if (logger != null) {
			logger.log(string);
		}
		else {
			buffer.add(string);
		}
    }	
    
    static void setLogger(LambdaLogger logger) {
    		Logger.logger = logger;   
    		  		
    		if (buffer != null) {
    			for (String entry: buffer) {
    				log(entry + "*");
    			}
    			
    			buffer = null;
    		}
    }
}
