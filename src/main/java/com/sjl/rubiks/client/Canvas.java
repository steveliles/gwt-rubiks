package com.sjl.rubiks.client;

import com.google.gwt.core.client.*;
import com.google.gwt.dom.client.*;
import com.google.gwt.user.client.ui.*;

public class Canvas extends Widget {

    private Context2d ctx;
    
    public Canvas(int aWidth, int aHeight){
        setElement(Document.get().createElement("canvas"));
        setPixelSize(aWidth, aHeight);
        getElement().setAttribute("width", aWidth + "px");
        getElement().setAttribute("height", aHeight + "px");
        
        ctx = initContext(getElement());
    }

    public void translate(int anX, int aY) {
        ctx.translate(anX, aY);
    }
    
    public void setFillStyle(Colour aColour) {
        ctx.setFillStyle(aColour.asHtmlColour());
    }
    
    public void setStrokeStyle(Colour aColour) {
        ctx.setStrokeStyle(aColour.asHtmlColour());        
    }
    
    public void beginPath() {
        ctx.beginPath();
    }

    public void stroke() {
        ctx.stroke();
    }

    public void fill() {
        ctx.fill();
    }

    public void moveTo(XYCoord aCoord) {
        ctx.moveTo(aCoord.getX(), aCoord.getY());
    }

    public void lineTo(XYCoord aCoord) {
        ctx.lineTo(aCoord.getX(), aCoord.getY());
    }

    public void setStrokeWidth(int aWidth) {
        ctx.setLineWidth(aWidth);
    }   
    
    private native Context2d initContext(Element anElement)/*-{ return anElement.getContext("2d");  }-*/;
    
    static class Context2d extends JavaScriptObject {
        
        protected Context2d(){}
        
        public final native void setStrokeStyle(String aColour)/*-{ 
            this.strokeStyle = aColour;
        }-*/; 
        
        public final native void setLineWidth(int aLineWidth)/*-{
            this.lineWidth = aLineWidth;
        }-*/;
        
        public final native void setLineCap(String aLineCap)/*-{ 
            this.lineCap = aLineCap;
        }-*/; 

        public final native void translate(int anX, int aY) /*-{
            this.translate(anX, aY);
        }-*/;

        public final native void lineTo(int clientX, int clientY) /*-{
            this.lineTo(clientX, clientY);
        }-*/;

        public final native void beginPath() /*-{
            this.beginPath();           
        }-*/;

        public final native void moveTo(int clientX, int clientY) /*-{
            this.moveTo(clientX, clientY);
        }-*/;

        public final native void stroke() /*-{
            this.stroke();
        }-*/;
        
        public final native void fill() /*-{
            this.fill();
        }-*/;
        
        public final native void arc(int anX, int aY, int aRadius, double aStartAngle, double anEndAngle, boolean anAntiClockwise)/*-{
            this.arc(anX, aY, aRadius, aStartAngle, anEndAngle, anAntiClockwise);
        }-*/;

        public final native void setFillStyle(String aColour)/*-{
            this.fillStyle = aColour;
        }-*/;
        
        public final native void setFillStyle(byte aRed, byte aGreen, byte aBlue)/*-{
            this.fillStyle = "rgb(" + aRed + "," + aGreen + "," + aBlue + ")";
        }-*/;
        
        public final native void drawRect(int x1, int y1, int x2, int y2)/*-{
            this.fillRect(x1, y1, x2, y2);
        }-*/;
    } 
}
