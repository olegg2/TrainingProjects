package com.company;

public class Main {

    public static void main(String[] args) {

	//System.out.print(getDeterminant());
    }




    public static int getDeterminant (int[][] matrix){
        int res=0;
        int length = matrix.length;
        if(matrix.length==1) return matrix[0][0];

        for (int a = 0; a <length ; a++) {


        int[][] matrix2 = new int[length-1][length-1];


        for (int i = 0; i <matrix2.length ; i++) {
            int count=0;
            for (int j = 0; j <matrix2.length ; j++) {
                if(j==a)
                    count++;
                matrix2[i][j]=matrix[i+1][j+count];
            }
        }

            res=res-((int)Math.pow(-1,a+1)*matrix[0][a]*getDeterminant(matrix2));
        }


        return res;
    }
}
