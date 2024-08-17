package OOPS.Practise_Questions.ConseptPractise;

class Demo{
    int num0;
    static int num1; // If we create a static type variabe then this variable will be shared among all the objects.. Means what ever the value is inside it will be same for all the objects and if we change the value of a variable from any class then it will be changes for all the objects

    public static void Print(Demo obj){
        System.out.println("Num0: "+ obj.num0);// we can't use the non-static variable in the static method directly if we try to do so it will throw an error so if we want to to that then we have to pass the object to the method and then we can access that non-static variable using object
    }
    static{ // It is called static block it is used to initalize static properties r static variable this block of code executes only ones when the class is load to the memory
        int num0 = 11;

    }

}

public class staticKeyword {
    public static void main(String[] args) {
        Demo obj1 = new Demo();
        obj1.num0 = 12;
        Demo.num1 = 6; // we can directly use the static properties of the class using class name
        // class is first lod ot the memory when ist first object is created but if we want to load the class to the memory but not want to create its object then we use forName("classNameThatWeWantToLoadInTheMemory") this method is a static method so we dont need to create the object of any class to use it And name of the class is Class
        // Class.forName("Demo");
        
    }
    
}
