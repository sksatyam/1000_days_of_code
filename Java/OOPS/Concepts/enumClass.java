enum Status {
    RUNNING, FAILED, ERROR, CHECKING; // enum is a specil class which is used to make nemed constants, In other words
                                      // these all are the objects of the Status CLASS
}

enum Laptop {
    // enum extends from Enum class
    Macbook(2000/*
                 * This is an argument, Since it is a object we can pass arguments, to do so we
                 * have to create a parameterised constructor
                 */), XPS(1500), Surface(1200), Thinkpad(800);

    private int price;

    private Laptop(int price) { // Here we are creating the private constructor because it is gonna called from
                                // the same class. it is also means we can't create object of this class out
                                // side of this class, and in this case we are not creating its objects outside
                                // of the class. but still can use this class coz its is enum class we doesn't
                                // have to use new keyword to instanciate its object we can just use it as a
                                // variable
        this.price = price;
    }

    // we can also create methods in this class
    public void getPrice() {
        System.out.println(price);
    }

}

public class enumClass {
    public static void main(String[] args) {
        Status obj; // This is how we creates an object of enum class wwe doesnt have to use new
                    // Keyword
        obj = Status.RUNNING;

        // This is how we acces the enum members
        if (obj == Status.RUNNING) {
            System.out.println("All Ok!");
        } else {
            System.out.println("Not Fine!");
        }

        // enum member is stored in order just like array so we can access it using its
        // index
        int index = obj.ordinal(); // this method returns index value of the enum member

        // we can even create an array of all members of any enum class
        Status[] obj2 = Status.values();
        for (Status s : Status.values()/* obj2 we could hava also used this */) {
            System.out.println(s);
        }
        switch (obj) {
            case RUNNING: // we doesnt have to use Status.RUNNING because object is alreay status type
                System.out.println("Running...");
                break;
            case FAILED:
                System.out.println("Failed...");
                break;
            default:
                break;
        }

        Laptop objLap = Laptop.Macbook; // here in this case we have enum class so we cant create its object using new
                                        // keyword, its not coz of private constructor it is coz this is not allowed in
                                        // java even if we hava public constructor
        objLap.getPrice();

    }
}
