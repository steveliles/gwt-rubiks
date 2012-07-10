package com.sjl.rubiks.client;

import java.util.*;

public class Angle {

    private static Map<Integer, Angle> cache = new HashMap<Integer, Angle>();
    
    public static Angle get(int aDegrees) {
        Angle _result = cache.get(aDegrees);
        if (_result == null) {
            _result = new Angle(aDegrees);
            cache.put(aDegrees, _result);
        }
        return _result;
    }
    
    private double degrees;
    private double radians;
    private Double cos;
    private Double sin;
    
    private Angle(double anAngleInDegrees) {
        degrees = anAngleInDegrees;
        radians = Math.toRadians(degrees);
    }
    
    public double asDegrees() {
        return degrees;
    }
    
    public double asRadians() {
        return radians;
    }
    
    public double cos() {
        if (cos == null) {
            cos = Math.cos(radians);
        }
        return cos;
    }
    
    public double sin() {
        if (sin == null) {
            sin = Math.sin(radians);
        }
        return sin;
    }
    
}
