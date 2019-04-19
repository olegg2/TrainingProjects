package com.company;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new FixedEmployee("q",13));
        employees.add(new FixedEmployee("q",13));
        employees.add(new HourEmployee("q",11));
        employees.add(new FixedEmployee("q",12));
        employees.add(new HourEmployee("q",2));
        employees.add(new HourEmployee("q",1));

        Collections.sort(employees,new EmployeeComparator());
        System.out.println(employees);
        System.out.println("____________________________\n");
        if(employees.size()>=5){
            for (int i = 0; i <5 ; i++) {
                System.out.print(employees.get(i));
            }
        }
        System.out.println("____________________________\n");
        if(employees.size()>=3){
            for (int i = employees.size()-1; i>employees.size()-4 ; i--) {
                System.out.print(employees.get(i));
            }
        }
//////////////////////////////////
        File file = new File("arara.txt");
        writeFile(employees,file);

//////////////////////////////////

    }

    static void writeFile (Collection<Employee> employees,File file){

        try(PrintWriter bfwriter = new PrintWriter(new FileWriter(file,false))
           ) {
            for (Employee e:employees
                    ) {
                bfwriter.write(e.toString());
            }
        }catch (Exception e){System.out.println(e+" mistake");}


    }

    static String readFile (File file){
        try {
            BufferedReader bfreader = new BufferedReader(new FileReader(file));
            String str;
            while(str=bfreader.readLine())

            }

        }

    }


}



class EmployeeComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        int rez=-1;
        if(o1.monthlySalary==o2.monthlySalary){
            if(o1.name.compareTo(o2.name)>0)
                return rez;
        }else
        if(o1.monthlySalary>o2.monthlySalary)
            return rez;
        else  return -rez;

        return rez;
    }
}
