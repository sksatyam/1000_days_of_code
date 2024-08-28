//package OOPS.Practise_Questions.Practise;

/*
 Question: Create an abstract class Employee with properties name and id, and an abstract method calculateSalary(). Create subclasses FullTimeEmployee and PartTimeEmployee that provide specific implementations of the calculateSalary() method.
    Focus: Abstract classes, abstract methods, and partial implementation
*/

abstract class Employee {
    long id;
    String Name;

    Employee() {
    };

    Employee(String Name, Long id) {
        this.Name = Name;
        this.id = id;
    }

    public abstract int calculateSalary();
}

class FullTimeEmployee extends Employee {
    FullTimeEmployee(String Name, Long id) {
        super(Name, id);
    }

    public int calculateSalary() {
        return 30000;
    }
}

class PartTimeEmployee extends Employee {
    public int calculateSalary() {
        return 20000;
    }
}

public class Abstraction {

}
