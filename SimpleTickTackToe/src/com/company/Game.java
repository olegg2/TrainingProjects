package com.company;
import static com.company.PrintMethod.*;
import java.util.Scanner;

public class Game {
    private Desk desk;
    private int length;
    private Player player1;
    private Player player2;
   private char standardSymbol;
    Game(Desk desk,Player player1,Player player2){
        this.desk=desk;
        this.player1=player1;
        this.player2=player2;
        length=desk.getLength();
        standardSymbol=desk.getDeskMatrix()[0][0].getState();

    }



    public boolean gameEnd(){
        int count;
        int count2;
        int count3;
        char symbol=' ';



        for (int i = 0; i <length ; i++) {
            count=0;
            count2=0;
            count3=0;
            for (int j = 0; j <length-1 ; j++) {
                if(desk.getDeskMatrix()[i][j].getState()==desk.getDeskMatrix()[i][j+1].getState()
                        & desk.getDeskMatrix()[i][j].getState()!=standardSymbol){
                    count++;
                    symbol=desk.getDeskMatrix()[i][j].getState();
                    System.out.println(count);
                    System.out.println("desk.getDeskMatrix()["+i+"]["+j+"]==desk.getDeskMatrix()["+(i)+"]["+(j+1)+"]");
                }
                if(desk.getDeskMatrix()[j][i].getState()==desk.getDeskMatrix()[j+1][i].getState()
                        & desk.getDeskMatrix()[j][i].getState()!=standardSymbol){
                    count2++;
                    symbol=desk.getDeskMatrix()[j][i].getState();
                    System.out.println(count);
                    System.out.println("desk.getDeskMatrix()["+j+"]["+i+"]==desk.getDeskMatrix()["+(j+1)+"]["+(i)+"]");
                }
                if(desk.getDeskMatrix()[j][j].getState()==desk.getDeskMatrix()[j+1][j+1].getState()
                        & desk.getDeskMatrix()[j][j].getState()!=standardSymbol) {
                    count3++;
                    symbol = desk.getDeskMatrix()[j][j].getState();
                    System.out.println(count);
                    System.out.println("desk.getDeskMatrix()["+j+"]["+j+"]==desk.getDeskMatrix()["+(j+1)+"]["+(j+1)+"]");
                }

                if(count==length-1||count2==length-1||count3==length-1){
                    if(symbol==player1.getSymbol()){
                        player1.setWinner(true);}
                    else{
                        player2.setWinner(true);}

                    return true;}


            }
        }

        return false;
    }


    public void start(){
        int row;
        int col;
        Scanner scanner= new Scanner(System.in);
        while (true) {
            desk.printMyDesk();
            pr(player1.getName()+" write coordinats:");
            row=scanner.nextInt();
            col=scanner.nextInt();
            player1.click(desk.getDeskMatrix(),row,col );
            if(gameEnd()) end();

            desk.printMyDesk();
            pr(player2.getName()+" write coordinats:");
            row=scanner.nextInt();
            col=scanner.nextInt();
            player2.click(desk.getDeskMatrix(),row,col);
            if(gameEnd()) end();

        }
    }
    private void end(){
        String player;
        if(player1.isWinner())
            player=player1.getName();
        else
        player=player2.getName();
        pr(player+" wins the game");
        System.exit(0);
    }
    public Desk getDesk() {
        return desk;
    }

    public void setDesk(Desk desk) {
        this.desk = desk;
    }
}
