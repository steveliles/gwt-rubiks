package com.sjl.rubiks.client;

import com.google.gwt.core.client.*;

public class RubikCubeState extends JavaScriptObject {

    protected RubikCubeState() {        
    }
    
    public final Point getOrigin() {
        return new SingleColumnMatrix(new double[]{ getOriginX(), getOriginY(), getOriginZ() });
    }
    
    public final Matrix getInitialTransformation() {
        return Matrix.Factory.newRotateMatrix(
            Angle.get(getRotateX()), 
            Angle.get(getRotateY()), 
            Angle.get(getRotateZ())
        );
    }
    
    public final native double getOriginX()/*-{ return (this.origin) ? this.origin.x : 0; }-*/;
    public final native double getOriginY()/*-{ return (this.origin) ? this.origin.y : 0; }-*/;
    public final native double getOriginZ()/*-{ return (this.origin) ? this.origin.z : 0; }-*/;
    
    public final native int getSideLength()/*-{ return (this["side-length"]) ? this["side-length"] : 20; }-*/;
    
    public final native int getRotateX()/*-{ return (this["rotate-x"]) ? this["rotate-x"] : 0; }-*/;
    public final native int getRotateY()/*-{ return (this["rotate-y"]) ? this["rotate-y"] : 0; }-*/;
    public final native int getRotateZ()/*-{ return (this["rotate-z"]) ? this["rotate-z"] : 0; }-*/;
}
