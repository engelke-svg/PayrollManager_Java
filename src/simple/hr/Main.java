package simple.hr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // department objects
        Department dept1 = new Department("Accounting");
        Department dept2 = new Department("IT");
        Department dept3 = new Department("Sales");

        // added department to a list
        List<Department> departments = new ArrayList<>();
        departments.add(dept1);
        departments.add(dept2);
        departments.add(dept3);

        // address objects
        Address address = new Address("5 Emerald close", "Kintston", "Kingston", "00000");

        // company object
        Company abc = new Company("ABC Company", address, departments);

        // salaried employees
        SalariedEmployee empl1= new SalariedEmployee("Tom Sawyer", 65000, dept1);
        SalariedEmployee empl2= new SalariedEmployee("Jan White", 57000, dept2);
        SalariedEmployee empl3= new SalariedEmployee("Joe Brown", 50000, dept3);
        SalariedEmployee empl4= new SalariedEmployee("Sarah Thomas", 50000, dept3);
        SalariedEmployee empl5= new SalariedEmployee("Alex Eucker", 40000, dept2);


        // array to store employees
        Employee[] employees = {empl1, empl2, empl3, empl4, empl5};

        // print employee info
        List<Employee>  employeeList = Arrays.asList(employees);

        // print stream
        employeeList.stream().forEach(System.out::println);

        // group employees by department
        System.out.println("employees grouped by department");
        Map<String, List<Employee>> groupedByDepartment =
                employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        groupedByDepartment.forEach(
                (department, employeesInDepartment) ->
                {
                    System.out.println(department);
                    employeesInDepartment.forEach(
                            employee -> System.out.printf("   %s%n", employee)
                    );
                }
        );



    }
}
