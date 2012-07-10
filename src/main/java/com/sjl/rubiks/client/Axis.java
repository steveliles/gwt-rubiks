package com.sjl.rubiks.client;

public class Axis {

    private Point origin;
    private Vector x;
    private Vector y;
    private Vector z;
    
    public Axis(Point anOrigin, Vector anX, Vector aY, Vector aZ) {
        origin = anOrigin;
        x = anX;
        y = aY;
        z = aZ;
    }
    
    public void draw(Camera aCamera) {
        // TODO
    }
    
    public void translate(Vector aVector) {
        origin.plus(aVector);
    }
    
    public void transform(Matrix aMatrix) {
        origin.multiply(aMatrix);
        x.multiply(aMatrix);
        x.normalize();
        y.multiply(aMatrix);
        y.normalize();
        z.multiply(aMatrix);
        z.normalize();
    }
    
}
