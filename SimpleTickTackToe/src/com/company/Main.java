package com.company;
import java.util.Scanner;

import static com.company.PrintMethod.*;
public class Main {

    public static void main(String[] args) {
      /*  Scanner sc = new Scanner(System.in);
        Desk desk1 = new Desk(3);
        pr(desk1.getDeskMatrix().length);
       // desk1.setOMatrix();
        desk1.printMyDesk();*/
        //pr(desk1);

        Game game = new Game(new Desk(3),new Player("n1",'x'),new Player("n2",'y'));

        game.start();
      /*  game.getDesk().getDeskMatrix()[0][1].setState('x');
        game.getDesk().getDeskMatrix()[1][2].setState('x');
        game.getDesk().getDeskMatrix()[2][1].setState('x');
        game.getDesk().getDeskMatrix()[2][1].setState('x');
        pr(game.gameEnd());

        pr(game.gameEnd());
        game.getDesk().printMyDesk();*/
      /*  for (int i = 0; i <game.getDesk().getLength() ; i++) {
            for (int j = 0; j <game.getDesk().getLength() ; j++) {
                game.getDesk().getDeskMatrix()[i][j].setState('x');
                pr(game.getDesk().getDeskMatrix()[i][j].isBlocked());

            }
        }
        pr("fdf"+game.gameEnd());
*/
    }
}
