package com.rudgyard.lambda.utilities;

import com.rudgyard.lambda.utilities.Coordinate;
import com.rudgyard.lambda.utilities.Logger;

public class Request {
	
	static double metresPerDegree=111189.57696;
	
    Coordinate endPoint1;
    Coordinate endPoint2;

    public Coordinate getEndPoint1() {
        Logger.log("getEndPoint1()");
        
        return endPoint1;
    }

    public Coordinate getEndPoint2() {
        Logger.log("getEndPoint2()");
        
        return endPoint2;
    }
    
    public Double  getEndPoint1Latitude() {
        Logger.log("getEndPoint1Latitude()");
        
        return endPoint1.getLatitude();
    }
    
    public Double getEndPoint1Longitude() {
        Logger.log("getEndPoint1Longitude()");
        
        return endPoint1.getLongitude();
    }
    
    public Double getEndPoint2Latitude() {
        Logger.log("getEndPoint2Latitude()");
        
        return endPoint2.getLatitude();
    }
    
    public Double setEndPoint2Longitude() {
        Logger.log("setEndPoint2Longitude()");
        
        return endPoint2.getLongitude();
    }
    
    public void setEndPoint1Latitude(Double latitude) {
        Logger.log("setEndPoint1Latitude(Double latitude)");
        
        endPoint1.setLatitude(latitude);
    }
    
    public void setEndPoint1Longitude(Double latitude) {
        Logger.log("setEndPoint1Longitude(Double latitude)");
        
        endPoint1.setLongitude(latitude);;
    }
    
    public void setEndPoint2Latitude(Double latitude) {
        Logger.log("setEndPoint2Latitude(Double latitude)");
        
        endPoint2.setLatitude(latitude);;
    }
    
    public void setEndPoint2Longitude(Double latitude) {
        Logger.log("setEndPoint2Longitude(Double latitude)");
        
        endPoint2.setLongitude(latitude);;
    }
    
    public void setEndPoint1() {
        Logger.log("setEndPoint1()");
        
        endPoint1 = new Coordinate(null, null);
    }

    public void setEndPoint2() {
        Logger.log("setEndPoint2()");
        
        endPoint2 = new Coordinate(null, null);
    }

    public void setEndPoint1(Double latitude, Double longitude) {
        Logger.log("setEndPoint1(Double latitude, Double longitude)");
		
        endPoint1 = new Coordinate(latitude, longitude);
    }

    public void setEndPoint2(Double latitude, Double longitude) {
		Logger.log("setEndPoint2(Double latitude, Double longitude)");
		
        endPoint2 = new Coordinate(latitude, longitude);
    }
    
    public void setEndPoints(Double endPoint1Latitude, Double endPoint1Longitude, Double endPoint2Latitude, Double endPoint2Longitude) {
		Logger.log("setEndPoints(Double endPoint1Latitude, Double endPoint1Longitude, Double endPoint2Latitude, Double endPoint2Longitude)");
		
        setEndPoint1(endPoint1Latitude, endPoint1Longitude);
        setEndPoint2(endPoint2Latitude, endPoint2Longitude);
    }
    
    public Request(Double endPoint1Latitude, Double endPoint1Longitude, Double endPoint2Latitude, Double endPoint2Longitude) {
		Logger.log("Request(Double endPoint1Latitude, Double endPoint1Longitude, Double endPoint2Latitude, Double endPoint2Longitude)");
		
        setEndPoints(endPoint1Latitude, endPoint1Longitude, endPoint2Latitude, endPoint2Longitude);
    }
        
    public Request() {
    		Logger.log("Request()");
    		
    	    setEndPoint1();
    	    setEndPoint2();
    }
    
	double getSphericalDistance () {
		Logger.log("getSphericalDistance()");
		Logger.log(String.format("endPoint1.latitude = %f", endPoint1.getLatitude()));
		Logger.log(String.format("endPoint1.longitude = %f", endPoint1.getLongitude()));
		Logger.log(String.format("endPoint2.latitude = %f", endPoint2.getLatitude()));
		Logger.log(String.format("endPoint2.longitude = %f", endPoint2.getLongitude()));
		
        double longitudinalDifference = endPoint1.getLongitude() - endPoint2.getLongitude();

        double distance = Math.acos(Math.sin(degreesToRadians(endPoint1.getLatitude())) * Math.sin(degreesToRadians(endPoint2.getLatitude())) + Math.cos(degreesToRadians(endPoint1.getLatitude())) * Math.cos(degreesToRadians(endPoint2.getLatitude())) * Math.cos(degreesToRadians(longitudinalDifference)));

        double degrees = radiansToDegrees(distance);

        return (degrees * Request.metresPerDegree);
    }

    private static double degreesToRadians(double degrees) {
		Logger.log("degreesToRadians(double degrees)");
		
        return (degrees * Math.PI / 180.0);
    }

    private static double radiansToDegrees(double radians) {
		Logger.log("radiansToDegrees(double radians)");
		
        return (radians * 180 / Math.PI);
    }
}