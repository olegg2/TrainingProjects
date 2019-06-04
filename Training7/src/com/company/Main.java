package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(TripleDouble2(451999277L, 41177722899L));
        System.out.println(TripleDouble2(1222345L, 12345L));
    }

    public static int[] twoSum(int[] numbers, int target) {
        // int[] res;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target)
                    return new int[]{numbers[i], numbers[j]};

            }
        }

        return null; // Do your magic!
    }

    public static int TripleDouble2(long num1, long num2) {

        String numb1 = String.valueOf(num1);
        String numb2 = String.valueOf(num2);
        for (int i = 0; i < 10; i++) {
            String c = String.valueOf(i);
            if (numb1.contains(c + c + c) && numb2.contains(c + c)) return 1;
        }
        return 0;
    }

    public static int TripleDouble(long num1, long num2) {
        //transform long to int[]
        String[] x = String.valueOf(num1).split("");
        String[] y = String.valueOf(num2).split("");

        int[] numb1 = new int[x.length];
        int[] numb2 = new int[y.length];
        for (int i = 0; i < x.length; i++) {
            numb1[i] = Integer.parseInt(x[i]);
        }
        for (int i = 0; i < y.length; i++) {
            numb2[i] = Integer.parseInt(y[i]);
        }
        //count and equals
        int count1 = 1;
        int res = 0;
        for (int i = 0; i < numb1.length - 1; i++) {
            if (numb1[i] == numb1[i + 1]) {
                count1++;
                System.out.println("count1 = " + count1);
            } else count1 = 1;
            if (count1 == 3) {
                res = numb1[i];
                System.out.println("res = " + res);
                break;
            }
        }
        count1 = 1;
        for (int i = 0; i < numb2.length - 1; i++) {
            if (numb2[i] == res && numb2[i + 1] == res) {
                System.out.print("res!");
                return 1;
            }
        }
        return 0;

    }
}
