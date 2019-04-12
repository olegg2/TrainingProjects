package com.company;

import java.util.Arrays;

public class Desk {
    private Piece[][] deskMatrix;
    private int winner;
    private int length;

    Desk(int a){
        length = a;
        deskMatrix = new Piece[length][length];
        for (int i = 0; i <deskMatrix.length ; i++) {
            for (int j = 0; j < deskMatrix.length; j++) {
                deskMatrix[i][j]=new Piece('O');
            }
        }
        winner = 0;

    }
     Desk(){
        length=3;
        deskMatrix = new Piece[3][3];
         for (int i = 0; i <deskMatrix.length ; i++) {
             for (int j = 0; j < deskMatrix.length; j++) {
                 deskMatrix[i][j]=new Piece('O');
             }
         }
    }


    public void printMyDesk(){
        for (int i=0;i<deskMatrix.length;i++){
            for (int j=0;j<deskMatrix.length;j++) {
                System.out.print(deskMatrix[i][j].getState());
            }
            System.out.println();
        }
    }



    public Piece[][] getDeskMatrix() {
        return deskMatrix;
    }



    public int getLength(){
        return deskMatrix[0].length;
    }

    @Override
    public String toString() {
        return "Desk{" +
                "deskMatrix=" + Arrays.toString(deskMatrix) +
                '}';
    }
}
