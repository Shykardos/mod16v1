package com.goit.test;

import com.goit.HelloWorld;
import org.junit.Test;
import org.testng.AssertJUnit;


public class HelloWorldTest {

    @Test
    public void testHelloWorld() {
        AssertJUnit.assertEquals("Hello, World!!", HelloWorld.sayHello());
    }
}