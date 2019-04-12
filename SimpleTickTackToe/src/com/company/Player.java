package com.company;

public class Player {
    private char symbol;
    private String name;
    private boolean winner;

    Player(String name,char symbol){
        this.name=name;
        this.symbol=symbol;
    }

    public void click(Piece[][] matrix,int row,int col){
        if(!matrix[row][col].isBlocked()){
            matrix[row][col].setState(symbol);
        }else{
            System.out.println("is blocked");
        }

    }

    public boolean isWinner() {
        return winner;
    }

    public void setWinner(boolean winner) {
        this.winner = winner;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
