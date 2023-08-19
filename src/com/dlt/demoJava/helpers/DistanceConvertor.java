package com.dlt.demoJava.helpers;

public class DistanceConvertor {
    public static double kmToMiles(double km) {
        double miles = km / 1.6;
        return miles;
    }

    public static  double milesToKm(double miles) {
        return miles * 1.6;
    }

}
