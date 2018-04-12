package com.service.test005.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestTest005 {

        Test005Delegate test005Delegate = new Test005Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = test005Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}