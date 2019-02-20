package com.stackroute.pe4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Collection;
import java.util.List;

public class Transpose {

    public String transpose(String str){
         String dummy ="";


        for(String ss: str.split(" +")){
            List<String> S_list =  Arrays.asList(ss.split(""));

            Collections.reverse(S_list);

            dummy += String.join("",S_list) + " ";        }
        return dummy.trim();

    }
}
