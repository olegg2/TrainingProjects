package com.company;

import java.util.HashMap;
import java.util.Map;

public class MorseCode {

    public static String get(String morseCode){
        Map<String,String> decoder = new HashMap<>();
        char[] english = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
                'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
                ',', '.', '?' };
        String[] morse1=new String[english.length];

        String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
                "-----", "--..--", ".-.-.-", "..--.." };
        for (int i = 0; i <morse.length ; i++) {
            morse1[i]=Character.toString(english[i]);
            decoder.put(morse[i],morse1[i]);
        }

            if(decoder.containsKey(morseCode)){
            return decoder.get(morseCode);
            }
            else return "-1";

    }
}
