enum Status {
    RUNNING, FAILED, ERROR, CHECKING; // enum is a specil class which is used to make nemed constants, In other words
                                      // these all are the objects of the Status CLASS
}

public class EnumClass {
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
        for (Status s : obj2) {
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

    }
}
