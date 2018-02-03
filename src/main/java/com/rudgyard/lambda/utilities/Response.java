package com.rudgyard.lambda.utilities;

public class Response {
    Double sphericalDistance;

    public Double getSphericalDistance() {
        return sphericalDistance;
    }
  
    public void setSphericalDistance(Double sphericalDistance) {
        this.sphericalDistance = sphericalDistance;
    }

    public Response(Double sphericalDistance) {
        setSphericalDistance(sphericalDistance);
    }

    public Response() {
    }
}