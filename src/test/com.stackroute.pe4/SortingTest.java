package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

import static org.junit.Assert.*;

public class SortingTest {
    Sorting sort;

    @Before
    public void setUp() throws Exception {

        sort=new Sorting();
    }

    @After
    public void tearDown() throws Exception {

        sort=null;
    }

    @Test
    public void sorting() {

        assertEquals(Arrays.asList(new String[] {"apple","boy"}),sort.sorting("boy apple"));
        assertEquals(Arrays.asList(new String[] {"an","by","of"}),sort.sorting("of an by"));



    }
}