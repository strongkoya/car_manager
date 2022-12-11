package com.example.car_manager;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlaceTest {

    @Test
    public void getHashcode() {
        Place p = new  Place("c");
        assertEquals("c",p.getHashcode());
    }

    @Test
    public void setHashcode() {
       fail();
    }
}