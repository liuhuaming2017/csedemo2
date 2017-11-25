package com.service.csedemo2.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-11-25T13:30:08.733Z")

@RestSchema(schemaId = "csedemo2")
@RequestMapping(path = "/csedemo2", produces = MediaType.APPLICATION_JSON)
public class Csedemo2Impl {

    @Autowired
    private Csedemo2Delegate userCsedemo2Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userCsedemo2Delegate.helloworld(name);
    }

}