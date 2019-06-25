package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String str = "I love little cats";
        String intStr = "2+3!=10";
      /*  Pattern pattern1 = Pattern.compile("\\Q2+3!=10\\E");
        Matcher mather1 = pattern1.matcher(intStr);
        while (mather1.find()) {
            System.out.println(mather1.start() + " " + mather1.group() + " ");
        }*/


      /*  Pattern superPattern = Pattern.compile("\\d\\d[-/\\\\]");
        Matcher mat = superPattern.matcher("12\\23\\43");
        while (mat.find()){
            System.out.println(mat.group()+"   "+mat.start());
        }*/

        /*Pattern pattern2 = Pattern.compile("\"[^\"]+\"");
        Matcher matcher2 = pattern2.matcher("alsldl  \"asd\" ds \"dd\" \"ffff\"");
        while(matcher2.find()){
            System.out.println(matcher2.start()+"  "+matcher2.group());
        }*/
       /* Pattern pattern2 = Pattern.compile("^a");
        Matcher matcher2 = pattern2.matcher("al \na\"asd\" ds \"dd\" \"ffff\"f");
        while(matcher2.find()){
            System.out.println(matcher2.start()+"  "+matcher2.group());
        }*/
       /* Pattern pattern2 = Pattern.compile("a$",Pattern.MULTILINE);
        Matcher matcher2 = pattern2.matcher("a\na");
        while(matcher2.find()){
            System.out.println(matcher2.start()+"  "+matcher2.group());
        }*/
     /*  Pattern pattern3= Pattern.compile("ca(e)?t");
       Matcher matcher3 = pattern3.matcher("I love caets and dog s");
       while(matcher3.find()){
           System.out.println(matcher3.start()+"  "+matcher3.group());
       }*/

       /*Pattern plPattern = Pattern.compile("<[a-zA-Z].*?>");
       Matcher plMatcher = plPattern.matcher("<f1>  asfa<fdsd> <g>");
       while (plMatcher.find()){
           System.out.println(plMatcher.start()+ "  "+plMatcher.group());
       }*/
      /*  Pattern plPattern = Pattern.compile("[0-9]{4,6}");
        Matcher plMatcher = plPattern.matcher("123 dsf sf  1234sdf12345 dfs df 123456");
        while (plMatcher.find()) {
            System.out.println(plMatcher.start() + "  " + plMatcher.group());

        }*/

        Pattern plPattern = Pattern.compile("([sd])a\\1a\\1");
        Matcher plMatcher = plPattern.matcher("sasasasa");
        while (plMatcher.find()){
            System.out.println(plMatcher.start()+ "  "+plMatcher.group());
        }
      // System.out.print("xalax alax afdfds".replaceAll("(\\w)(\\w)(\\w)(\\w*)","$1$3$2$4"));
    }

    public static String pigIt(String str) {
        return str.replaceAll("(\\w)(\\w*)","$2$1ay");
    }
}
