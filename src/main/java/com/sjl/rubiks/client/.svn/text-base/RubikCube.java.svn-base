package com.sjl.rubiks.client;

import java.util.*;

public class RubikCube {

    private Point origin;
    private Axis axis;
    private List<Block> blocks;
    
    public RubikCube(Point anOrigin, double aBlockSideLength) {
        origin = anOrigin;
        blocks = new ArrayList<Block>();
        axis = new Axis(origin.copy(), 
            new SingleColumnMatrix(1, 0, 0), 
            new SingleColumnMatrix(0,1,0),
            new SingleColumnMatrix(0,0,1)
        );
                
        for (int z=-1; z<=1; z++) {
            for (int x=-1; x<=1; x++) {
                for (int y=-1; y<=1; y++) {
                    blocks.add(newBlock(origin, x, y, z, aBlockSideLength));
                }
            }
        }
    }
    
    public void draw(Camera aCamera) {
        for (Block _b : sort(blocks, aCamera.getLocation())) {
            _b.draw(aCamera);
        }
        axis.draw(aCamera);
    }    
    
    public void translate(Vector aVector) {
        origin.plus(aVector);
        axis.translate(aVector);
        for (Block _b : blocks) {
            _b.translate(aVector);
        }
    }
    
    public void transform(Matrix aMatrix) {
        origin.multiply(aMatrix);
        axis.transform(aMatrix);
        for (Block _b : blocks) {
            _b.transform(aMatrix);
        }
    }
    
    private Block newBlock(Point anOrigin, int anXFactor, int aYFactor, int aZFactor, double aSideLength) {
        Point _origin = new SingleColumnMatrix(
            anOrigin.getX() + (anXFactor*aSideLength),
            anOrigin.getY() + (aYFactor*aSideLength),
            anOrigin.getZ() + (aZFactor*aSideLength)
        );
        return new Block(_origin, aSideLength);
    }
    
    private List<Block> sort(List<Block> aBlocks, final Point aPoint) {
        List<Block> _result = new ArrayList<Block>(aBlocks);
        Collections.sort(_result, new Comparator<Block>(){
            public int compare(Block aB1, Block aB2) {
                double _b1 = (aB1.distance(aPoint));
                double _b2 = (aB2.distance(aPoint));
                return (_b1 > _b2) ? 1 : (_b1 == _b2) ? 0 : -1; 
            }            
        });
        Collections.reverse(_result);
        return _result;
    }
}
