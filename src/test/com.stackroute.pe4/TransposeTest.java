package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeTest {
    Transpose tp;

    @Before
    public void setUp() throws Exception {

        tp=new Transpose();
    }

    @After
    public void tearDown() throws Exception {

        tp=null;
    }

    @Test
    public void transpose() {

        assertEquals("a quick brown fox jumps over the lazy dog",tp.transpose("a kciuq nworb xof spmuj revo eht yzal god"));
        assertEquals("a girl in the city",tp.transpose("a lrig ni eht ytic"));
        assertEquals("roopali",tp.transpose("ilapoor"));
        assertEquals("hsuyip",tp.transpose("piyush"));



    }
}