package Lab1.EmployeeTypes;

public abstract class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public abstract void showDetails();
}