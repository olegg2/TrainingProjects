package com.company.Lesson02.Lesson02DZ;

import java.util.ArrayList;
import java.util.List;

public class Main2DZ {

    public static void main(String[] args) {
        //1
        int[] array1 = new int[11];
        for (int i = 0; i <array1.length ; i++) {
            array1[i]=(int)(Math.random()*6)-1;
            System.out.print(array1[i]+" ");
        }
            //
        int count=0;
        int numb=0;
        int mostfrequent=0;
        for (int arr:array1) {
            int frequency=0;
            for (int i = 0; i <array1.length ; i++) {
                if(arr==array1[i])
                    frequency++;
            } 
            //
            if(frequency>=mostfrequent && arr!=numb){
                if(frequency==mostfrequent){
                    count++;
                }else count=0;
                numb=arr;
                mostfrequent=frequency;
            }
        }
        if(count==0)
        System.out.println("numb = "+numb+" frequency = "+mostfrequent);

        //2
       /* int[][] matrix2 =new int[5][8];
        Random rand2 = new Random();
        int max=matrix2[0][0];
        int min=matrix2[0][0];
        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <8 ; j++) {
                matrix2[i][j]=rand2.nextInt(199)-99;
                if(matrix2[i][j]>max)
                    max=matrix2[i][j];
                if(matrix2[i][j]<min)
                    min=matrix2[i][j];
                System.out.print(matrix2[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("max = "+max);
        System.out.println("min = "+min);*/

       //3
      /*      int[] array3 = new int[30];
            Random rand = new Random();
            int max=0;
            int index=0;
        for (int i = 0; i <array3.length ; i++) {
            array3[i] = rand.nextInt(31)-15;
            System.out.print(array3[i]+" ");
            if(array3[i]>=max){
                max=array3[i];
                index=i;
            }
        }
        System.out.print("\nmax = "+max+" index = "+(index+1));
        */
        //4
      /*  Rectangle rectangle1 = new Rectangle(2,4);
        rectangle1.getInformation();
        Rectangle rectangle2 = new Rectangle();
        rectangle2.setLength(4);
        rectangle2.setWidth(5);
        rectangle2.getInformation();*/
        //5
        Robot robot1 = new Robot("Sim Ple");
        Robot robot2 = new CoffeRobot("Kapu Chino");
        Robot robot3 = new RobotDancer("Tanz Poll");
        Robot robot4 = new RobotCooker("Met An");
        List<Robot> robots = new ArrayList<>();
        robots.add(robot1);
        robots.add(robot2);
        robots.add(robot3);
        robots.add(robot4);
        for (Robot rob:robots) {
            rob.work();
        }

    }
}
