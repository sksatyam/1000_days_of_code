package Practise;

/*
 Question: Create a class Book with properties like title, author, price, and ISBN. Write methods to set and get the values of these properties. Create an object of this class and set the values using the methods.
Focus: Basic class creation, object instantiation, and encapsulation.

*/
class Book{
    // Private Variables
    private String title,author,ISBN;
    private double price;

    // Default Constructor
    Book(){};
    
    // Parameterised Constructor
    Book(String title, String author, String ISBN,int price){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.price = price;
    }

    // Setters
    void settitle(String title){
        this.title = title;
    }

    void setauthor(String author){
        this.author = author;
    }

    void setISBN(String ISBN){
        this.ISBN = ISBN;
    }

    void setprice(double price){
        this.price = price;
    }

    // Getters
    String gettitle(){
        return this.title;
    }

    String getauthor(){
        return this.author;
    }

    String getISBN(){
        return this.ISBN;
    }

    double getprice(){
        return this.price;
    }

    void printdetails(){
        System.out.println("Title: "+ this.title+"\n"+"Author: "+ this.author+"\n"+"ISBN: " +this.ISBN + "\n"+"Price: "+this.price);
    }
}

public class ClassesAndObjects {
    public static void main(String[] args) {
        // Creating Instance of class Book
        Book C = new Book();

        // Setting Values Using Setters
        C.settitle("Fundamantals of C");
        C.setauthor("Reema Tharija");
        C.setISBN("SMSW_4563");
        C.setprice(449.99);

        // Using Printdetails() Method to print details of the book
        C.printdetails();
    }
    
}
