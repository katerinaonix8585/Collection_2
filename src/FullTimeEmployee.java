public class FullTimeEmployee extends Employee{
    double salary;

    public FullTimeEmployee(String firstName, String secondName, double salary) {
        super(firstName, secondName);
        this.salary = salary;
    }

    @Override
    public double getSalary(){
        return 0.9 * this.salary;
    }
}
