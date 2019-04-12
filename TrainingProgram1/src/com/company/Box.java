package com.company;
import static com.company.PrintMethod.*;
import java.util.List;

public class Box<T> {
    private T length;
    private T width;
    private T height;

    Box(T length,T width,T height){
        this.length=length;
        this.width=width;
        this.height=height;

    }

    public Box() {

    }

    public static void printLine(List<?> mylist){
        for (Object o:mylist
             ) {
            pr(o+" ");

        }
    }



    public static <K extends Number> int getVolume(K length,K width,K height){
        int a=(int) length;
        int b = (int) width;
        int res = a*b;
        //length=(K) res;
        return res;
//???????????
    }
    public interface Comparable<T> {
        public int compareTo(T o);
    }
    public static <K extends Number> int compareParameters(K length,K width){
        boolean b=length.equals(width);

        int res;
        if(b)
        res=1;
        else res=0;
        return res;

    }

    public T getLength() {
        return length;
    }

    public void setLength(T length) {
        this.length = length;
    }

    public T getWidth() {
        return width;
    }

    public void setWidth(T width) {
        this.width = width;
    }

    public T getHeight() {
        return height;
    }

    public void setHeight(T height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Box{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
