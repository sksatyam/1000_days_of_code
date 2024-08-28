// Define an interface Animal with methods eat() and sleep(). Implement this interface in classes Dog and Cat, providing specific implementations for each method. Create objects of Dog and Cat and call their methods.

interface Animal {
    void eat();

    void sleep();
}

class Dog implements Animal {
    public void eat() {
        System.out.println("Dog is eating!...");

    }

    public void sleep() {
        System.out.println("Dog is sleeping!...");
    }
}

class Cat implements Animal {
    public void eat() {
        System.out.println("Cat is eating!...");
    }

    public void sleep() {
        System.out.println("Cat is sleeping!...");
    }
}

public class Interface {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.eat();
        cat.sleep();

        Animal dog = new Dog();
        dog.eat();
        dog.sleep();
    }

}
