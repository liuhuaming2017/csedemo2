package com.service.testcse.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-12-15T08:31:31.537Z")

@RestSchema(schemaId = "testcse")
@RequestMapping(path = "/testcse", produces = MediaType.APPLICATION_JSON)
public class TestcseImpl {

    @Autowired
    private TestcseDelegate userTestcseDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userTestcseDelegate.helloworld(name);
    }

}
