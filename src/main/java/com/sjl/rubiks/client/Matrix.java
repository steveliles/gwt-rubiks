package com.sjl.rubiks.client;

public interface Matrix {    
    
    public int rowCount();
    
    public int columnCount();
    
    public double get(int aRow, int aColumn);
    
    public void multiply(Matrix aMatrix);
    
    public class Factory {
        
        public static Matrix newRotateMatrix(Angle anXAxis, Angle aYAxis, Angle aZAxis) {
            Matrix _result = newRotateXMatrix(anXAxis);
            _result.multiply(newRotateYMatrix(aYAxis));
            _result.multiply(newRotateZMatrix(aZAxis));
            return _result;
        }

        public static Matrix newRotateXMatrix(Angle anAngle) {            
            return new MultiColumnMatrix(new double[][]{
              {1d, 0d, 0d},
              {0d, anAngle.cos(), -anAngle.sin()},
              {0d, anAngle.sin(), anAngle.cos()}
            });
        }
        
        public static Matrix newRotateYMatrix(Angle anAngle) {
            return new MultiColumnMatrix(new double[][]{
                {anAngle.cos(), 0d, anAngle.sin()},
                {0d, 1d, 0d},
                {-anAngle.sin(), 0d, anAngle.cos()}                
            });
        }
        
        public static Matrix newRotateZMatrix(Angle anAngle) {
            return new MultiColumnMatrix(new double[][]{
                {anAngle.cos(), -anAngle.sin(), 0d},
                {anAngle.sin(), anAngle.cos(), 0d},
                {0d, 0d, 1d}
            });
        }
        
    }
    
}
