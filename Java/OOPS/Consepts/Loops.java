package OOPS.Consepts;
public class Loops {
    public static void main(String[] args){
        // All the loops of java is same as C++, there is no difference in syntax and consept of loops between java and c++ 
        // Syntax will be added later on
        // Labled breaek and labled continue is same as goto statement in c++
        // Labeled break

                outerLoop:
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (j == 1) {
                            break outerLoop;
                        }
                        System.out.println("i: " + i + ", j: " + j);
                    }
                }

        // Labeled Continue

                outerLoop:
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                     if (j == 1) {
                         continue outerLoop;
                     }
                        System.out.println("i: " + i + ", j: " + j);
                    }
                }
    }
}
        

