package com.goit.test;

import com.goit.HelloWorld;
import org.junit.Test;
import org.testng.AssertJUnit;

import static org.testng.AssertJUnit.assertEquals;

public class HelloWorldTest {

    @Test
    public void testHelloWorld() {
        AssertJUnit.assertEquals("Hello, World!", HelloWorld.sayHello());
    }

}