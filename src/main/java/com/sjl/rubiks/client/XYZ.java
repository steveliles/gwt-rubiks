package com.sjl.rubiks.client;

public interface XYZ extends Matrix {

    public double getX();
    
    public double getY();
    
    public double getZ();
    
    public void plus(XYZ aVector);
    
    public void minus(XYZ aVector);        
    
}
