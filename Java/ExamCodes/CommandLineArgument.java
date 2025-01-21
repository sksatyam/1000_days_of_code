public class CommandLineArgument {        
    public static void main(String[] args) {
            if (args.length == 0) {
                System.out.println("No arguments passed. Please provide arguments!");
            }
            else{
                System.out.println("Arguments passed from the command line:");
                for (int i = 0; i < args.length; i++) {
                    System.out.println("Argument " + (i + 1) + ": " + args[i]);
                }
            }
        }
}
