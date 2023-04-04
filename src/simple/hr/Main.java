package simple.hr;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
/*
        SalariedEmployee empl1= new SalariedEmployee("Tom Sawyer", 65000);
        HourlyEmployee empl2= new HourlyEmployee("Jane White", 35);
        Contractor contractor1 = new Contractor("Joe's Plumbing", 5, 335.67);

        System.out.println(empl1.calcualtePay());
        System.out.println(empl2.calcualtePay());
        System.out.println();
 */

        SalariedEmployee empl1= new SalariedEmployee("Tom Sawyer", 65000);
        SalariedEmployee empl2= new SalariedEmployee("Jan White", 57000);
        SalariedEmployee empl3= new SalariedEmployee("Joe Brown", 50000);

        String fileName = "Paystubs.txt";

        List<SalariedEmployee> employees = new ArrayList<>();
        employees.add(empl1);
        employees.add(empl2);
        employees.add(empl3);

        SalariedEmployee.printStub(fileName, employees);


    }
}
