package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountCharactersTest {
    CountCharacters cc;

    @Before
    public void setUp() throws Exception {
        cc = new CountCharacters();
    }

    @After
    public void tearDown() throws Exception {
        cc = null;
    }

    @Test
    public void check() {
        assertEquals(1,cc.check("apple",'a'));
        assertEquals(1,cc.check("harry",'h'));
        assertEquals(2,cc.check("roopali Gandhi",'a'));
        assertEquals(10,cc.check("Java is java again java again",'a'));
    }
}