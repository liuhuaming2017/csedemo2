package com.service.test2.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestTest2 {

        Test2Delegate test2Delegate = new Test2Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = test2Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}