// package OOPS.Consepts;

class Demo {
    public void Printer() {
        System.out.println("Inside the Demo class");
    }
}

public class AnanomusObjects {
    public static void main(String[] args) {
        // Demo newObj = new Demo(); // here what we are doing is we are creating a
        // object and storing it into a reference type variable

        new Demo().Printer(); // this is how we creates an ananomus object what we deo here we just creates an
                              // object and use it and we are not storing it into any refference variable so
                              // it is not reusable
    }
}
