package com.example.songr.controler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloControllerTest {

    @Test
    void helloWorld() {
        HelloController hello = new HelloController();
        String response = hello.HelloWorld();
        assertEquals("Hello, World!",response);
    }
}