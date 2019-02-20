package com.stackroute.pe4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Collection;
import java.util.List;

public class Sorting {

    public List<String> sorting(String str){



            List<String> S_list = Arrays.asList(str.split(" +"));


            Collections.sort(S_list);

            return S_list;






    }
}
