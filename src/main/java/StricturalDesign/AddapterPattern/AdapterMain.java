package StricturalDesign.AddapterPattern;

import java.util.ArrayList;
import java.util.List;

/*
    The idea of Adapter Design pattern is to adapt non related classes with different (in this example OfficeEmployeeAdapter is the adapter) implementation.
*/
public class AdapterMain {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        Employee employee = new FactoryEmployee("Martin", "Morrison", 34);
        OfficeEmployee officeEmployee = new OfficeEmployee("Andrew", "32", "Doe");

        employees.add(employee);
        /*
            Here we use the adapter class to convert OfficeEmployee to an Employee because OfficeEmployee does not implement Employee.
            Therefore we don`t want to change the class signature
        */
        employees.add(new OfficeEmployeeAdapter(officeEmployee));

        employees.forEach(e -> System.out.println(e.getFirstName() + " " + e.getLastName() + " " + e.getAge()));
    }
}
