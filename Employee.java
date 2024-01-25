public class Employee {
    int id;
    String firstName;
    String lastName;
    int salary;
    int percent;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    int getID() {
        return this.id;
    }

    String getfirstName() {
        return this.firstName;
    }

    String getlastName() {
        return this.lastName;
    }

    String getName() {
        return this.firstName + " " + this.lastName;
    }

    int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    int getAnnualSalary() {
        return this.salary * 12;
    }

    public int raiseSalary(int percent) {
        return this.salary = salary + percent; // seharusnya tipe data float atau double. secara logic, increase salary = salary + (salary*percent);
    }

    public String toString() {
        return "Employee[id=" + id + ", name=" + getName() + ", Salary=" + getSalary() + "]";
    }
}