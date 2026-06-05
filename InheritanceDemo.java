class Employee {
    void work() {
        System.out.println("Employee is working");
    }
}

class Developer extends Employee {
    @Override
    void work() {
        System.out.println("Developer is writing code");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Employee emp = new Developer();
        emp.work();
    }
}