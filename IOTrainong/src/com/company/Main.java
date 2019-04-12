package com.company;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

       /* File file = new File("file.txt");
        File file2 = new File("file2.txt");
        FileInputStream in = new FileInputStream(file);
        FileOutputStream out = new FileOutputStream("filleeeea.txt");


        File file3 = new File("file.txt");
        File file4 = new File("file4.txt");

        FileReader reader = new FileReader("file.txt");
        FileWriter writer = new FileWriter("fileee.txt");
       *//* int b;
        while ((b=reader.read())!=-1){
            System.out.println((char)b+" ");
            writer.write(b);
        }*//*

        BufferedReader br = new BufferedReader(reader);
       *//* String s;
        while ((s=br.readLine())!=null){
            System.out.print(s+" ");
        }*//*

        Scanner sc = new Scanner(br);

        while (sc.hasNext()){
            System.out.println(sc.next());
        }
*/
        Scanner scs = new Scanner(new BufferedReader(new FileReader("file2.txt")));
        scs.useLocale(Locale.UK);
        while (scs.hasNext()){
            if(scs.hasNextDouble())
                System.out.println("lol"+scs.next());
            if(scs.hasNextInt())
            System.out.println("ala"+scs.next());
        }

    }
}
