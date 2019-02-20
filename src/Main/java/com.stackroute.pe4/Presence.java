package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Presence {

    public boolean presence(String str1, String str2) {

        return Pattern.compile(str2).matcher(str1).find();


    }
}
