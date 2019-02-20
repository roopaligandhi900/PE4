package com.stackroute.pe4;

public class CountCharacters {
    public int check(String string,char ch){
        string=string.toLowerCase();

        String character = Character.toString(ch);

        character=character.toLowerCase();

        int length = string.length();
        int subLength = string.replace(character,"").length();
        int count = length-subLength;
        return count;
    }
    }



