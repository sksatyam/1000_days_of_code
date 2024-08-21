package OOPS.Consepts;


/**
 * Basic Inner class Structure
*/
class A{

    public void printHelloWorld(){
        System.out.println("Hello World From A!");
    }

    class InnerClassOfA {
        public void configPrinter(){
            System.out.println("No config! LOL");
        }
        
    }

    static class AnotherInnerClassOfA{
        public void Lol(){
            System.out.println("Lol!");
        }
    }
}
public class InnerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.printHelloWorld();

        A.InnerClassOfA obj2 =  obj.new InnerClassOfA(); // This is how we create object of a inner class

        A.InnerClassOfA obj3 = new A().new InnerClassOfA(); // To create the object of a inner class we need to object of its ouuter class. We can even use Annanomus Object of that outer class
        A.AnotherInnerClassOfA obj4 = new A.AnotherInnerClassOfA(); // this is how we create a object of Inner Static class, Here we doesn't Need any object of outer class to create a new object
    }
    
}
