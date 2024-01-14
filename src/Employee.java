public class Employee {
    private String firstName;
    private String secondName;

    public Employee(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String info(){
        return String.format("%s %s:", this.firstName, this.secondName);
    }

    public double getSalary() {
        return 0.0;
    }

}
