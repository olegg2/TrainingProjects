package com.company;

public class Main {

    public static void main(String[] args) {


        //System.out.println(digPow(695,2));

       /* String a[] = new String[]{ "arp", "live", "strong" };
        String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
        String[] r=  inArray(a,b);
        for (int i = 0; i <r.length ; i++) {
            System.out.println((i+1)+" = "+r[i]);
        }*/

       // System.out.println(""+findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}));
       /* System.out.println("aaaaaaaaaaaaaaaa"+findOdd(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}));
        System.out.println("aaaaaaaaaaaaaaaa"+findOdd(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5}));
        System.out.println("aaaaaaaaaaaaaaaa"+findOdd(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5}));
        System.out.println("aaaaaaaaaaaaaaaa"+findOdd(new int[]{10}));
        System.out.println("aaaaaaaaaaaaaaaa"+findOdd(new int[]{1,1,1,1,1,1,10,1,1,1,1}));
        System.out.println("aaaaaaaaaaaaaaaa"+findOdd(new int[]{5,4,3,2,1,5,4,3,2,10,10}));*/
      /*  int a=2345/10;
        System.out.println(2345%10);
        System.out.println();
        System.out.println(a%10);
      squareDigits(8119);*/

    }

    public static int squareDigits(int number){
        int res=0;
        int ten=10;
        int a=number;
        int i=1;
        while(a>0){
            int count= a%ten;
            res+=((count)*(count)*i);
            if((count*count)/ten>0){
                i*=100;
            }else{
                i*=10;
            }
            a=a/ten;

            System.out.println("res = "+res);

        }
        return res;
    }

    public static int findOdd(int[] a) {
        for (int i = 0; i <a.length ; i++) {
            int num=a[i];
            int count=0;
            for (int j = 0; j <a.length ; j++) {
                if(num==a[j]){
                    count++;
                }
               }
            if((count%2)!=0)
                return num;
        }
        return 0;
    }


    public static int findIt(int[] A) {
        int xor = 0;
        for (int i = 0; i < A.length; i++) {
            xor ^= A[i];
        }
        return xor;
    }

    public static String[] inArray(String[] array1, String[] array2) {

        String[] resArray;
        String psarray="";
        for (int i = 0; i <array1.length ; i++) {
            for (int j = 0; j <array2.length ; j++) {
                if(array2[j].indexOf(array1[i])>0){
                    if(!psarray.contains(array1[i])) {
                        psarray += array1[i] + " ";
                        //resArray[i]=array1[i];
                        System.out.println("array1 = " + array1[i] + " resarray = " + psarray);
                    }
                }
            }
        }
        resArray=psarray.split(" ");
        return resArray;
    }

    public static long digPow(int n, int p) {
        int sum=0;
        int count=0;
        String num=Integer.toString(n);
        for (int i = 0; i <num.length() ; i++,count++) {
           sum+=Math.pow(Character.getNumericValue(num.charAt(i)),count+p);
        }
        if(sum%n==0){
            return  sum/n;
        }else
            return -1;
    }
}