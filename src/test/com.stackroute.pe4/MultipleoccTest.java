package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleoccTest {
    Multipleocc mo;

    @Before
    public void setUp() throws Exception {

        mo=new Multipleocc();
    }

    @After
    public void tearDown() throws Exception {

        mo=null;
    }

    @Test
    public void multipleocc() {

        assertEquals("0-2",mo.multipleocc("nancy","na"));
        assertEquals("0-2 6-8",mo.multipleocc("brown br","br"));
        assertEquals("0-2",mo.multipleocc("roopali","ro"));
    }
}