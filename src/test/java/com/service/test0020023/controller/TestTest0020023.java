package com.service.test0020023.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestTest0020023 {

        Test0020023Delegate test0020023Delegate = new Test0020023Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = test0020023Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}