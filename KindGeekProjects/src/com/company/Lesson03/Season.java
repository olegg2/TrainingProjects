package com.company.Lesson03;

import java.util.Arrays;

public enum Season {
    SUMMER(31,Month.JUNE,Month.JULY,Month.AUGUST),
    AUTUMN(23,Month.SEPTEMBER,Month.OCTOBER,Month.NOVEMBER),
    WINTER(6,Month.DECEMBER,Month.FEBRUARY,Month.JANUARY),
    SPRING(14,Month.MARCH,Month.APRIL,Month.MAY);
 //
    private int advTemp;
    private Month[] months= new Month[3] ;

    Season(int advTemp,Month month1,Month month2,Month month3){
        this.advTemp=advTemp;
        this.months[0]=month1;
        this.months[1]=month2;
        this.months[2]=month3;
    }
    Season(){}

    public int getAdvTemp() {
        return advTemp;
    }

    public Month[] getMonths() {
        return months;
    }

    @Override
    public String toString() {
        return "Season "+name()+" {" +
                "advTemp=" + advTemp +
                ", months=" + Arrays.toString(months) +
                '}';
    }

}
