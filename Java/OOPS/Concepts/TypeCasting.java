package OOPS.Consepts;

class A{
    public void show1(){
        System.out.println("From class A");
    }
}

class B extends A{
    public void show2(){
        System.out.println("From class B");
    }
}

public class TypeCasting {
    public static void main(String[] args) {
        // Typecasting simply means converting a variable into another type to store another type of data in it
        // there are two two types of typecasting one is Up casting and another is Down Casting
        // the type of casting in which you doesn't lose any data after casting is called Up casting 
        // The type of casting in which we lose data after type casting is called down casting

        A obj = new B();
        B obj2 = (B) obj; 
        obj2.show1();

    }
}
