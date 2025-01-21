    
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Constructors {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 25);

        System.out.println("Details of Person 1:");
        person1.displayInfo();
    }
}

