package predicate;

import java.util.Objects;

public class Employee {

    private String name;
    private int roll;
    private String dept;
    private String city;

    public Employee(String name, int roll, String dept, String city) {
        this.name = name;
        this.roll = roll;
        this.dept = dept;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }

    public String getDept() {
        return dept;
    }

    public String getCity() {
        return city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return roll == employee.roll &&
                name.equals(employee.name) &&
                dept.equals(employee.dept) &&
                city.equals(employee.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, roll, dept, city);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                ", dept='" + dept + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
