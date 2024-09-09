package OOPS.Consepts;

class A{
    public void printer(int a){
        System.out.println("hello here is your value: "+ a);
    }

}

class B extends A{
    @Override // this is an anotation this is used when we want to override a function this makes sures the function is overriding properley if not this throws an compile time error which privents the logical error
    public void printer(int b){
        System.out.println("Here is your both values: " + b );
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        B obj = new B();
        obj.printer(2);
    }
    // If we want to override a method then we have to have everything same as the method in the parent class(Access modefier, Method Type, return type method name and ever arguments), the only thing that can be different is the funtion of the method means the code Inside the method
    
}
