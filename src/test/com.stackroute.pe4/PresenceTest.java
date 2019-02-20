package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PresenceTest {

    Presence pr;

    @Before
    public void setUp() throws Exception {

        pr= new Presence();
    }

    @After
    public void tearDown() throws Exception {

        pr=null;
    }

    @Test
    public void presence() {

        assertEquals(true,pr.presence("my life","life"));
        assertEquals(true,pr.presence("india is my county","india"));
    }
}