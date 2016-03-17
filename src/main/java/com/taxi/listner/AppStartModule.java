package com.taxi.listner;

import com.sun.jersey.guice.JerseyServletModule;
import com.sun.jersey.guice.spi.container.servlet.GuiceContainer;
import com.taxi.MyResource;
import com.taxi.service.Service;
import com.taxi.service.ServiceImpl;


public class AppStartModule extends JerseyServletModule {

    @Override
    protected void configureServlets() {
        bind(MyResource.class);
        bind(Service.class).to(ServiceImpl.class);
        serve("/*").with(GuiceContainer.class);
    }
}
