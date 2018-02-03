package com.rudgyard.lambda.utilities;

import com.rudgyard.lambda.utilities.Logger;

public class Coordinate {
    Double latitude;
    Double longitude;

    public String getCordinate() {
    		Logger.log("getCordinate()");
    		
    		if ((latitude == null) || (longitude == null)) {
    			return "null";
    		}
    		else {
    			return "[ " + Double.toString(latitude) + ", " + Double.toString(longitude) + "]";
    		}
    }
    
    public Double getLatitude() {
		Logger.log("getLatitude()");
		
        return latitude;
    }
    
    public Double getLongitude() {
		Logger.log("getLongitude()");
		
        return longitude;
    }

    public void setCoordinates(Double latitude, Double longitude) {
		Logger.log(String.format("setCoordinates(Double %s, Double %s)", latitude, longitude));
		
        this.latitude = latitude;
        this.longitude = longitude;
    }
    
    public void setLatitude(Double latitude) {
		Logger.log(String.format("setLatitude(Double latitude)", latitude));
		
        this.latitude = latitude;
    }
    
    public void setLongitude(Double longitude) {
		Logger.log(String.format("setLongitude(Double %s)", longitude));
		
        this.longitude = longitude;
    }
    
    public void Cordinate() {
		Logger.log("Cordinate()");
		
        setCoordinates(null, null);
    }

    public Coordinate(Double latitude, Double longitude) {
		Logger.log(String.format("Coordinate(Double %s, Double %s)", latitude, longitude));
		
        setCoordinates(latitude, longitude);
    }
}
