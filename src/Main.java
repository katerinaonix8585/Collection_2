import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // ЗАДАЧА 1
        ArrayList<Contact> contacts = new ArrayList<>();

        contacts.add(new Contact("Петров Петр","88005004040"));
        contacts.add(new Contact("Иванов Иван","88005555555"));
        contacts.add(new Contact("Денисов Денис","88006006060"));
        contacts.add(new Contact("Климова Анна","880012312345"));
        contacts.add(new Contact("Сидорова Василиса","88007774445"));

        for (Contact person: contacts){
            System.out.println(person.info());
        }

        System.out.println("------------------------------------------------------");
        // ЗАДАЧА 2
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Петров Петр", 20, 4.74));
        students.add(new Student("Иванов Иван",19, 3.78));
        students.add(new Student("Денисов Денис",20, 4.54));
        students.add(new Student("Климова Анна", 19, 4.12));
        students.add(new Student("Сидорова Василиса",21, 3.71));

        double maxValue = students.get(1).grade();
        for (Student student: students) {
            if (student.grade() > maxValue) {
                maxValue = student.grade();
            }
        }
        System.out.println("Максимальная оценка: " + maxValue);

        System.out.println("------------------------------------------------------");
        // ЗАДАЧА 3
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new PartTimeEmployee("Петров", "Петр",12.5, 144));
        employees.add(new PartTimeEmployee("Иванов", "Иван", 11.0, 122));
        employees.add(new PartTimeEmployee("Денисов", "Денис",10.8, 138));
        employees.add(new FullTimeEmployee("Климова", "Анна", 1250));
        employees.add(new FullTimeEmployee("Сидорова", "Василиса", 1325));

        double summa = 0;
        for (Employee employee : employees) {
            summa += employee.getSalary();
        }

        System.out.println("Общая сумма зарплат: " + summa);



    }
}