package com.sjl.rubiks.client;

import com.google.gwt.core.client.*;

public class SceneState extends JavaScriptObject {

    protected SceneState() {        
    }
    
    public final native RubikCubeState getCubeState()/*-{ return this["rubik-cube"]; }-*/;
    public final native CameraState getCameraState()/*-{ return this["camera"]; }-*/;
    
}
