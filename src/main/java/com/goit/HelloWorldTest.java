package com.goit;

import org.junit.Test;
import org.testng.AssertJUnit;


public class HelloWorldTest {

    @Test
    public void testHelloWorld() {
        AssertJUnit.assertEquals("Hello, World!!", HelloWorld.sayHello());
    }
}