package com.sjl.rubiks.client;

import java.util.*;

public class Block {

    private Point origin;
    private List<Tile> tiles;
    
    public Block(Point aPoint, double aSideLength) {
        origin = aPoint.copy();
        tiles = new ArrayList<Tile>();                
  
        // green face on the bottom
        tiles.add(new Tile(newWorldOrigin(), aSideLength, Colour.GREEN));
        tiles.get(0).transform(Matrix.Factory.newRotateXMatrix(Angle.get(90)));
        
        // blue face on top
        tiles.add(new Tile(newWorldOrigin(), aSideLength, Colour.BLUE));     
        tiles.get(1).transform(Matrix.Factory.newRotateXMatrix(Angle.get(-90)));
        
        // red face in front
        tiles.add(new Tile(newWorldOrigin(), aSideLength, Colour.RED));
        
        // yellow face on right
        tiles.add(new Tile(newWorldOrigin(), aSideLength, Colour.YELLOW));
        tiles.get(3).transform(Matrix.Factory.newRotateYMatrix(Angle.get(-90)));
        
        // white face on left
        tiles.add(new Tile(newWorldOrigin(), aSideLength, Colour.WHITE));
        tiles.get(4).transform(Matrix.Factory.newRotateYMatrix(Angle.get(90)));
        
        // orange face on back
        tiles.add(new Tile(newWorldOrigin(), aSideLength, Colour.ORANGE));        
        tiles.get(5).transform(Matrix.Factory.newRotateYMatrix(Angle.get(180)));
                        
        translate((Vector)aPoint);
    }
    
    public double distance(Point aPoint) {
        return origin.distance(aPoint);
    }
    
    public void draw(Camera aCamera) {        
        for (Tile _t : sort(tiles, aCamera.getLocation())) {
            _t.draw(aCamera);
        }        
    }
    
    public void translate(Vector aVector) {       
        origin.plus(aVector);        
        for (Tile _t : tiles) {
            _t.translate(aVector);
        }
    }
    
    public void transform(Matrix aMatrix) {
        origin.multiply(aMatrix);
        for (Tile _t : tiles) {
            _t.transform(aMatrix);
        }
    }
    
    private List<Tile> sort(List<Tile> aTiles, final Point aPoint) {
        List<Tile> _result = new ArrayList<Tile>(aTiles);
        Collections.sort(_result, new Comparator<Tile>(){
            public int compare(Tile aT1, Tile aT2) {
                double _t1 = (aT1.distance(aPoint));
                double _t2 = (aT2.distance(aPoint));
                return (_t1 > _t2) ? 1 : (_t1 == _t2) ? 0 : -1;         
            }
        });
        Collections.reverse(_result);
        
        return _result;
    }
    
    private Point newWorldOrigin() {
        return new SingleColumnMatrix(0,0,0);
    }
}
