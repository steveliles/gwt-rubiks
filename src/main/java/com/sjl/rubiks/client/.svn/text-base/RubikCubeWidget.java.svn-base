package com.sjl.rubiks.client;

import java.util.*;

import com.google.gwt.user.client.*;
import com.google.gwt.user.client.ui.*;
import com.sjl.gwtutil.client.*;

/**
 * markup = {
 *   side-length:20,   
 * } 
 * 
 * @author steve
 */
public class RubikCubeWidget extends SimplePanel implements ActivatedWidget {

    private int width;
    private int height;
    
    private Canvas canvas;
    private Camera camera;
    private RubikCube cube;
    
    public RubikCubeWidget(Element anElement) {
        super(anElement);
        
        width = anElement.getOffsetWidth();
        height = anElement.getOffsetHeight();
        
        System.out.println(width + "x" + height);
        
        SceneState _scene = JSON.parse(anElement.getInnerHTML().trim());
        CameraState _cameraState = _scene.getCameraState();
        RubikCubeState _cubeState = _scene.getCubeState();
        
        anElement.setInnerHTML("");

        canvas = new Canvas(width, height);
        camera = new Camera(_cameraState.getOrigin(), _cameraState.getDirection(), canvas);
        
        add(canvas);               
        
        cube = new RubikCube(_cubeState.getOrigin(), _cubeState.getSideLength());
        cube.transform(_cubeState.getInitialTransformation());               
        
        draw();
    }
    
    @Override
    public Widget asWidget() {
        return this;
    }

    @Override
    public List<Element> getActivateableChildren() {
        return Collections.emptyList();
    }

    @Override
    public void add(ActivatedWidget aWidget) {
        // no-op
    }

    @Override
    public void onActivate(Activators anActivators) {
        onAttach();
        RootPanel.detachOnWindowClose(this);
    }

    private void draw() {
        canvas.translate(width/2, height/2);
        cube.draw(camera);
        canvas.translate(-width/2,-height/2);
    }
}
