package com.service.correios.config;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.service.correios.service.CorreiosService;

@Configuration
public class WebServiceConfig {
	
	@Autowired
    private Bus bus;
 
    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, new CorreiosService());
        endpoint.publish("/Correios");
        return endpoint;
    }
}
