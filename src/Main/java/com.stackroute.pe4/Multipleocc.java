package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Multipleocc {

    public String multipleocc(String str1, String str2) {

        String dummy="";
        Pattern pattern=Pattern.compile(str2);
        Matcher matcher=pattern.matcher(str1);

        while(matcher.find()){
            dummy += matcher.start() + "-" + matcher.end() + " ";

        }

        return dummy.trim();



    }
}
