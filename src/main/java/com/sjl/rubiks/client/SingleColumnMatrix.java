package com.sjl.rubiks.client;


public class SingleColumnMatrix implements Vector, Point {

    private double[] matrix;
    
    public SingleColumnMatrix(double anX, double aY, double aZ) {
        matrix = new double[]{ anX, aY, aZ };
    }
    
    public SingleColumnMatrix(double[] aMatrix) {
        matrix = aMatrix;
    }
    
    public final double getX() {
        return matrix[0];
    }
    
    public final double getY() {
        return matrix[1];
    }
    
    public final double getZ() {
        return matrix[2];
    }
    
    @Override
    public int rowCount() {
        return matrix.length;
    }

    @Override
    public int columnCount() {
        return 1;
    }
    
    public void normalize() {
        
    }
    
    public double distance(Point anOther) {
        return Math.sqrt(
            Math.pow(getX()-anOther.getX(),2)+
            Math.pow(getY()-anOther.getY(),2)+
            Math.pow(getZ()-anOther.getZ(),2)
        );
    }
    
    public Point copy() {
        return new SingleColumnMatrix(getX(), getY(), getZ());
    }
    
    public void plus(XYZ a3d) {
        matrix[0] = getX()+a3d.getX();
        matrix[1] = getY()+a3d.getY();
        matrix[2] = getZ()+a3d.getZ();
    }
    
    public void minus(XYZ a3d) {
        matrix[0] = getX()-a3d.getX(); 
        matrix[1] = getY()-a3d.getY(); 
        matrix[2] = getZ()-a3d.getZ();
    }
    
    @Override
    public XYCoord getScreenCoord(Camera aCamera) {
        Point _p = new SingleColumnMatrix(getX(),getY(),getZ());        
        _p.minus(aCamera.getLocation());
        
        return new XYCoord(
            (int)Math.round(_p.getX()*aCamera.getLocation().getZ()/_p.getZ()),
            (int)Math.round(_p.getY()*aCamera.getLocation().getZ()/_p.getZ())        
        );
    }

    @Override
    public double get(int aRow, int aColumn) {
        return matrix[aRow];
    }

    @Override
    public void multiply(Matrix aMatrix) {
        double[] _result = new double[rowCount()];
        for (int i=0; i<aMatrix.rowCount(); i++) {
            _result[i] = (matrix[0]*aMatrix.get(0,i)) + (matrix[1]*aMatrix.get(1,i)) + (matrix[2]*aMatrix.get(2,i));
        }
        matrix = _result;
    }        
    
    @Override
    public String toString() {
        return "[" + matrix[0] + "," + matrix[1] + "," + matrix[2] + "]";
    }
}
