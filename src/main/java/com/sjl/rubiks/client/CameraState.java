package com.sjl.rubiks.client;

import com.google.gwt.core.client.*;

public class CameraState extends JavaScriptObject {

    protected CameraState() {        
    }
    
    public final Point getOrigin() {
        return new SingleColumnMatrix(new double[]{ getOriginX(), getOriginY(), getOriginZ() });
    }
    
    public final Vector getDirection() {
        return new SingleColumnMatrix(new double[]{ getDirectionX(), getDirectionY(), getDirectionZ() });        
    }
    
    public final native double getOriginX()/*-{ return (this.origin) ? this.origin.x : 0; }-*/;
    public final native double getOriginY()/*-{ return (this.origin) ? this.origin.y : 0; }-*/;
    public final native double getOriginZ()/*-{ return (this.origin) ? this.origin.z : -100; }-*/;
    
    public final native double getDirectionX()/*-{ return (this.direction) ? this.direction.x : 0; }-*/;
    public final native double getDirectionY()/*-{ return (this.direction) ? this.direction.y : 0; }-*/;
    public final native double getDirectionZ()/*-{ return (this.direction) ? this.direction.z : 1; }-*/;
    
}
