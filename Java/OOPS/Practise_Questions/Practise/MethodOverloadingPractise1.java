package Practise;
class calc{
    public void add(int a,int b){
        System.out.println("Sum is : "+ (a+b));
    }
    public void add(int a, int b,int c){
        System.out.println("Sum is : "+ (a+b+c));
    }
    public void add(double a,double b){
        System.out.println("Sum is : "+(a+b));
    }
    public void add(String a,String b){
        System.out.println("Sum is : "+(a+b));
    }
}

public class MethodOverloadingPractise1 {
    public static void main(String[] args) {
        calc nc = new calc();
        System.out.println("Two Int add method! ");
        nc.add(12, 13);
        System.out.println("Three Int add Mehtod! ");
        nc.add(2, 2,2);
        System.out.println("Two Double add Method! ");
        nc.add(12.2d, 12.3d);
        System.out.println("Two String add Method! ");
        nc.add("1", "1");

    }
    
}
