package StricturalDesign.AddapterPattern.Adapter;

import StricturalDesign.AddapterPattern.ConcreteImplementation.OfficeEmployee;
import StricturalDesign.AddapterPattern.Interface.Employee;


public class OfficeEmployeeAdapter implements Employee {

    private OfficeEmployee officeEmployee;

    public OfficeEmployeeAdapter(OfficeEmployee officeEmployee) {
        this.officeEmployee = officeEmployee;
    }

    @Override
    public String getFirstName() {
        return officeEmployee.getName();
    }

    @Override
    public String getLastName() {
        return officeEmployee.getSurname();
    }

    @Override
    public Integer getAge() {
        return Integer.parseInt(officeEmployee.getAge());
    }
}
