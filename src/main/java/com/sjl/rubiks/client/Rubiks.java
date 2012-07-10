package com.sjl.rubiks.client;

import com.google.gwt.core.client.*;
import com.google.gwt.user.client.*;
import com.sjl.gwtutil.client.*;

public class Rubiks extends PageActivator {

    @Override
    protected void registerActivators() {
        register(new Activator() {
            public boolean canActivate(Element anElement) {
                return anElement.getClassName().contains("rubiks");
            }

            @Override
            public ActivatedWidget activate(Element anElement, PageActivator aPageActivator) {
                return new RubikCubeWidget(anElement);
            }                         
        });
        GWT.log("ready!");
    }    
    
}
