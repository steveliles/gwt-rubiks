package com.sjl.rubiks.client;

public class MultiColumnMatrix implements Matrix {
    
    private double[][] matrix;
    
    public MultiColumnMatrix(double[][] aMatrix) {
        matrix = aMatrix;
    }
    
    public int rowCount() {
        return matrix.length;    
    }
    
    public int columnCount() {
        return matrix[0].length;
    }
    
    public double get(int aRow, int aColumn) {
        return matrix[aRow][aColumn];
    }
    
    public void multiply(Matrix anOther) {        
        double[][] _result = new double[rowCount()][anOther.rowCount()];
        for (int i=0; i<rowCount(); i++) {
            for (int j=0; j<anOther.rowCount(); j++) {
                _result[i][j] = 
                    (get(i,0)*anOther.get(0,j)) +
                    (get(i,1)*anOther.get(1,j)) +
                    (get(i,2)*anOther.get(2,j));                
            }
        }
        matrix = _result;
    }
    
}
