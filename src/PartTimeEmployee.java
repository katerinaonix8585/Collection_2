public class PartTimeEmployee extends Employee{
    private double perHour;
    private int totalTime;

    public PartTimeEmployee(String firstName, String secondName, double perHour, int totalTime) {
        super(firstName, secondName);
        this.perHour = perHour;
        this.totalTime = totalTime;
    }

    @Override
    public double getSalary(){
        return this.perHour * this.totalTime;
    }
}
