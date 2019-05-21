package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.print(decode(".... . -.--   .--- ..- -.. ."));
    }

    public static String decode(String morseCode) {
        if(!morseCode.contains(" "))
            return MorseCode.get(morseCode);
        String[] morse = morseCode.split("   ");
        String res=new String();
        for(int i=0;i<morse.length;i++){
            String[] mor = morse[i].split(" ");
            for (int j = 0; j <mor.length ; j++) {
                res+=MorseCode.get(mor[j]);
            }
            res+=" ";
        }

        return res.trim();
    }
}
