package OOPS.Consepts;
public class conditionals {
    public static void main(String[] args){

        // all the syntax for the conditionals statements are asme as c++ like if else, elseif and ternary operators and also in switch case statements        
        // syntax for ternury operator
        // condition ? expression1: Expression2 :- if contion is true then expression 1 will evaluate other wise expression2 will evailuate and even we can create nested ternary operators
        // example 
        int a = 2;
        int b = 4;
        int max  = 0;
        max = a>b ? a:b;
        System.out.println(max);
    }
}
