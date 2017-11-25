package com.service.csedemo2.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestCsedemo2 {

        Csedemo2Delegate csedemo2Delegate = new Csedemo2Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = csedemo2Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}