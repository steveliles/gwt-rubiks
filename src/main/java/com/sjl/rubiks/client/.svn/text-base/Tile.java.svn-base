package com.sjl.rubiks.client;

public class Tile {

    private Point origin;// axis origin
    private Point centre;
    private Colour colour;
    private double sideLength;
    
    private Point c1, c2, c3, c4;    
    
    public Tile(Point anOrigin, double aSideLength, Colour aColour) {
        origin = anOrigin.copy();        
        colour = aColour;
        sideLength = aSideLength;
        
        double h = sideLength/2d;
        
        c1 = new SingleColumnMatrix(new double[]{origin.getX()-h,origin.getY()-h,origin.getZ()-h});
        c2 = new SingleColumnMatrix(new double[]{origin.getX()+h,origin.getY()-h,origin.getZ()-h});
        c3 = new SingleColumnMatrix(new double[]{origin.getX()+h,origin.getY()+h,origin.getZ()-h});
        c4 = new SingleColumnMatrix(new double[]{origin.getX()-h,origin.getY()+h,origin.getZ()-h});
        centre = new SingleColumnMatrix(new double[]{origin.getX(), origin.getY(), origin.getZ()-h});
    }
    
    public Colour getColour() {
        return colour;
    }
    
    public double distance(Point aPoint) {
        return centre.distance(aPoint);
    }
    
    public void transform(Matrix aMatrix) {
        origin.multiply(aMatrix);
        centre.multiply(aMatrix);
        c1.multiply(aMatrix);
        c2.multiply(aMatrix);
        c3.multiply(aMatrix);
        c4.multiply(aMatrix);
    }
    
    public void translate(Vector aVector) {        
        origin.plus(aVector);        
        centre.plus(aVector);
        c1.plus(aVector);
        c2.plus(aVector);
        c3.plus(aVector);
        c4.plus(aVector);        
    }
    
    public void draw(Camera aCamera) {
        aCamera.begin();
        aCamera.setStrokeColour(Colour.BLACK);
        aCamera.setStrokeWidth(2);
        aCamera.setFillColour(colour);
        aCamera.moveTo(c1);
        aCamera.lineTo(c2);
        aCamera.lineTo(c3);
        aCamera.lineTo(c4);
        aCamera.lineTo(c1);
        aCamera.fill();
        aCamera.stroke();        
    }
    
    @Override
    public String toString() {
        return centre.toString() + colour;
    }
}
