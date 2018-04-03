package com.service.test2.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-04-03T15:13:26.724Z")

@RestSchema(schemaId = "test2")
@RequestMapping(path = "/test2", produces = MediaType.APPLICATION_JSON)
public class Test2Impl {

    @Autowired
    private Test2Delegate userTest2Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userTest2Delegate.helloworld(name);
    }

}
