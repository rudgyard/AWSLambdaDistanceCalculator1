package com.rudgyard.lambda.utilities;

//import org.slf4j.Logger;

import com.amazonaws.services.lambda.runtime.Context; 
import com.amazonaws.services.lambda.runtime.RequestHandler;

import com.rudgyard.lambda.utilities.Request;
import com.rudgyard.lambda.utilities.Response;

import com.rudgyard.lambda.utilities.Logger;

public class DistanceCalculator implements RequestHandler<Request, Response> {
    
    public Response handleRequest(Request request, Context context) {
    	    	
        Logger.setLogger(context.getLogger());   
        
        Logger.log("Calling getSphericalDistance()...");
    	
        Double sphericalDistance = request.getSphericalDistance();
        
        return new Response(sphericalDistance);
    }
    
}