package com.bestreviewer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {

    @Test
    void testConstruction() {
        assertNotNull(new HelloWorld(),"Fail to construct HelloWorld instance.");
    }

    @Test
    void shouldReturnHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        assertEquals("Hello", helloWorld.sayHello());
    }
}