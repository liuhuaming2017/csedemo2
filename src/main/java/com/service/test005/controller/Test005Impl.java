package com.service.test005.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-04-12T11:44:05.528Z")

@RestSchema(schemaId = "test005")
@RequestMapping(path = "/test005", produces = MediaType.APPLICATION_JSON)
public class Test005Impl {

    @Autowired
    private Test005Delegate userTest005Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userTest005Delegate.helloworld(name);
    }

}
