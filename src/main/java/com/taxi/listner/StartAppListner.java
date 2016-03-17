package com.taxi.listner;

import com.google.common.reflect.ClassPath;
import com.sun.jersey.guice.JerseyServletModule;
import com.sun.jersey.guice.spi.container.servlet.GuiceContainer;

import java.io.IOException;


public class StartAppListner extends JerseyServletModule {

    private final String CONTROLLERS_PACKAGE = "com.taxi.controllers";

    private void controllerBinder(){
        ClassLoader contextClassLoader = Thread.currentThread()
                .getContextClassLoader();
        ClassPath classPath = null;
        try {
            classPath = ClassPath.from(contextClassLoader);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (ClassPath.ClassInfo info : classPath.getTopLevelClassesRecursive(CONTROLLERS_PACKAGE)){
            bind(info.load()).asEagerSingleton();
        }

    }

    @Override
    protected void configureServlets() {
        controllerBinder();
        serve("/*").with(GuiceContainer.class);
    }

}
