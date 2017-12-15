package com.service.testcse.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestTestcse {

        TestcseDelegate testcseDelegate = new TestcseDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = testcseDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}