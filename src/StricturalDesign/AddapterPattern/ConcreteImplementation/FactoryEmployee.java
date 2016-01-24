package StricturalDesign.AddapterPattern.ConcreteImplementation;

import StricturalDesign.AddapterPattern.Interface.Employee;


public class FactoryEmployee implements Employee {

    private String firstName;
    private String lastName;
    private Integer age;

    public FactoryEmployee(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public Integer getAge() {
        return age;
    }
}
