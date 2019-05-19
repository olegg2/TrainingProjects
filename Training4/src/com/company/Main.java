package com.company;


public class Main {


    public static void main(String[] args) {
        System.out.println(findNextSquare(143));
        //multipleThreeAndFive(24);
        //System.out.println(HighAndLow("12 2 -2 3 4 55 6 123"));
      /*  int[] d={1,2,3,4,2,4};
       int a= equalSides(d);
       System.out.println("number = "+a);*/
        //System.out.println(accum("DaPPdf"));
        //  GetSum(4,-2);
        // System.out.print(findNextSquare(196));
    }

    public static long findNextSquare(long sq) {
        double num = Math.sqrt(sq);
        if((num)%1>0)
            return -1;
        else return (long)Math.pow((Math.sqrt(sq)+1),2);
       /* int i = 1;
        while ((i * i) != sq) {
            i++;
            if (i * i > sq) return -1;
        }
        i++;
        return i * i;*/
       //return  0;
    }

    public static int GetSum(int a, int b) {
        int res = 0;
        int count1;
        int count2;
        if (a - b < 0) {
            count1 = a;
            count2 = b;
        } else {
            count2 = a;
            count1 = b;
        }
        for (int i = count1; i <= count2; i++) {
            res += i;
            System.out.println(i + " = " + res);
        }
        return res;
    }

    public static String accum(String s) {
        char[] array = s.toLowerCase().toCharArray();
        String res = "";
        for (int i = 0; i < array.length; i++) {
            res += "-" + Character.toUpperCase(array[i]);
            for (int j = 0; j < i; j++) {
                res += array[i];
            }
        }
        return res.substring(1);
    }

    public static int equalSides(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int sum1 = 0;
            int sum2 = 0;
            for (int j = 0; j < i; j++) {
                sum1 += array[j];
                System.out.println("i1= " + i + "  j= " + j + " sum= " + sum1);
            }
            for (int j = i + 1; j < array.length; j++) {
                sum2 += array[j];
                System.out.println("i2= " + i + "  j= " + j + " sum= " + sum2);
            }
            if (sum1 == sum2) return i;
        }
        return -1;

    }

    public static String HighAndLow(String numbers) {
        String[] array = numbers.split(" ");
        int min = Integer.parseInt(array[0]);
        int max = Integer.parseInt(array[0]);
        for (int i = 1; i < array.length; i++) {
            if (min > Integer.parseInt(array[i])) min = Integer.parseInt(array[i]);
            if (max < Integer.parseInt(array[i])) max = Integer.parseInt(array[i]);
        }

        return max + " " + min;
    }

    public static int multipleThreeAndFive(int number) {
        int res = 0;
        for (int i = 0; i < number; i++) {
            if ((i % 3 == 0) || (i % 5 == 0))
                res += i;
            System.out.println("i= " + i + " res= " + res);
        }
        return res;
    }



}