package com.sjl.rubiks.client;

public class Camera {

    private Point location;
    private Vector direction;
    private Canvas canvas;
    
    public Camera(Point aLocation, Vector aDirection, Canvas aCanvas) {
        location = aLocation;
        direction = aDirection;
        canvas = aCanvas;
    }
    
    public void setStrokeColour(Colour aColour) {
        canvas.setStrokeStyle(aColour);
    }
    
    public void setStrokeWidth(int aWidth) {
        canvas.setStrokeWidth(aWidth);        
    }
    
    public void setFillColour(Colour aColour) {
        canvas.setFillStyle(aColour);
    }
    
    public Point getLocation() {
        return location;
    }
    
    public Vector getDirection() {
        return direction;
    }

    public void begin() {
        canvas.beginPath();        
    }
    
    public void stroke() {
        canvas.stroke();
    }
    
    public void fill() {
        canvas.fill();
    }
    
    public void moveTo(Point aPoint) {        
        canvas.moveTo(aPoint.getScreenCoord(this));
    }
    
    public void lineTo(Point aPoint) {        
        canvas.lineTo(aPoint.getScreenCoord(this));
    }
    
}
