package OOPS.Consepts;

// In interface by default all the functions are public and abstract
// if we create a variable in interface then by default all its variables are final and static
// we cant instanciate an interface in java just like abstract class it only can be inherited by using keyword implements
// We cant instancites a interface but we can create its anonymous inner class
interface A {
    void sayHello();

}

interface B extends A { // if we inherits into a interface from a interface we uses extends keyword
    void sayNo();
}

class C implements B {
    public void sayHello() {
        System.out.println("Hello! forn class C!");

    }

    public void sayNo() {
        System.out.println("No! form class C");
    }
}

public class Interface {

    public static void main(String[] args) {
        B obj = new B() {

            public void sayHello() {
                System.out.println("Hello");
            }

            public void sayNo() {
                System.out.println("No!");
            }
        };
        obj.sayHello();
        obj.sayNo();
        C obj2 = new C();
        obj2.sayHello();
        obj2.sayNo();
    }

}
