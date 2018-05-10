package com.service.test0020023.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-05-10T11:51:58.545Z")

@RestSchema(schemaId = "test0020023")
@RequestMapping(path = "/test0020023", produces = MediaType.APPLICATION_JSON)
public class Test0020023Impl {

    @Autowired
    private Test0020023Delegate userTest0020023Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userTest0020023Delegate.helloworld(name);
    }

}
