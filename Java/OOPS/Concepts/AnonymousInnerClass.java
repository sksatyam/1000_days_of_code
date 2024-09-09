// package OOPS.Consepts;

class A {
    public void sanjibPrinter() {

    }

}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        A obj = new A() { // this is called Anonymous Inner class and this even works for Abstract type
                          // outer class(Means we can even create the ananymous inner class of abstract
                          // class as its create the obect the inner class )
            public void sanjibPrinter() {
                System.out.println("Sanjib!");
            }
        };

        obj.sanjibPrinter();

    }

}
