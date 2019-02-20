package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceTest {
    Replace rp;

    @Before
    public void setUp() throws Exception {

        rp=new Replace();
    }

    @After
    public void tearDown() throws Exception {

        rp=null;

    }

    @Test
    public void replace() {

        assertEquals("faisy",rp.replace("daisy"));
        assertEquals("funny",rp.replace("dunny"));
        assertEquals("futty",rp.replace("dully"));
        assertEquals("faity fry",rp.replace("daily dry"));

    }
}