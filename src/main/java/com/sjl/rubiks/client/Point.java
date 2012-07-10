package com.sjl.rubiks.client;

public interface Point extends XYZ {

    public XYCoord getScreenCoord(Camera aCamera);
    
    public double distance(Point anOther);
    
    public Point copy();
    
}
