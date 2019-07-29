package com.company.Lesson02.Lesson02DZ;

public class Rectangle {
    private int length;
    private int width;
    private int perimeter;
    private int square;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
        perimeter=(length+width)*2;
        square=length*width;

    }

    public Rectangle(){
        length=width=0;
    }

    public int findPerimeter(){
        int res=perimeter= (length+width)*2;
        System.out.println("perimeter = "+res);
        return res;
    }
    public int findSquare(){
       int res=square= length*width;
        System.out.println("square = "+res);
        return res;
    }

    public void getInformation(){
        findPerimeter();
        findSquare();
        System.out.println("length = "+length+" width = "+width+" perimeter ="+
                perimeter+" square = "+square);
    }
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getPerimeter() {
        return perimeter;
    }



    public int getSquare() {
        return square;
    }


}
