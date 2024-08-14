package Tests;
class A{
    private int a;
    private String b;
    private double c;
    A(){

    }
    A(int a,String b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
}

class B extends A{
    // super(a,b,c); // Only this will not work
    int d;
    int e;
    B(int a,String b,double c){
        super(a,b,c);
    }
    B(int a,String b,double c,int d,int e ){
        super(a,b,c);
        this.d = d;
        this.e = e; 
    }
}


public class Test6Constructor {
    public static void main(String[] args) {
        B obj = new B(12,"Sanjib",12);

    }

}
