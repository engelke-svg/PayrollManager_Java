package simple.hr;

import java.util.List;

public class Company {
    private String name;
    private Address address;
    private List<Department> departments;

    public Company(String n, Address address){
        this.name = n;
        this.address = address;
    }

    public Company(String n, Address address, List<Department> dept){
        this.name = n;
        this.address = address;
        this.departments = dept;
    }

    public String getName() { return name; }

    public void getAddress() {
        address.getAddress();
    }

    public List<Department> getDepartments() { return departments; }
}
