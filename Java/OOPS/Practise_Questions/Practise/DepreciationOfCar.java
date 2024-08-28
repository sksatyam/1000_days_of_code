
// Having Logical error in this program
// package OOPS.Practise_Questions.Practise;
import java.time.Year;
import java.util.*;

class Depreciation {

    String name, Brand, VehicleType;
    int Price, Model, CurrentValue, Age;

    Depreciation() {
        name = "Not Provided";
        Brand = "Not Provided";
        VehicleType = "Not Provided";
    }

    Depreciation(String Brand, String name, String VehicleType, int Price, int Model) {
        this.name = name;
        this.Brand = Brand;
        this.VehicleType = VehicleType;
        this.Price = Price;
        this.Model = Model;
    }

    void getCurrentValue() {
        Year Cyear = Year.now(); // it is an oject so we hav to extract the value to integer to perform
                                 // arithmetic operations
        int cyearvalue = Cyear.getValue();
        Age = Model - cyearvalue;
        if (Age < 1) {
            CurrentValue = Price - ((10 / 100) * Price);
            System.out.println("Current Value : " + "more then" + CurrentValue);
        } else if (Age <= 2) {
            CurrentValue = Price - ((20 / 100) * Price);

            System.out.println("Current Value : " + CurrentValue);

        } else if (Age <= 3) {
            CurrentValue = Price - ((30 / 100) * Price);

            System.out.println("Current Value : " + CurrentValue);

        } else if (Age <= 4) {
            CurrentValue = Price - ((40 / 100) * Price);

            System.out.println("Current Value : " + CurrentValue);

        } else if (Age <= 5) {
            CurrentValue = Price - ((50 / 100) * Price);

            System.out.println("Current Value : " + CurrentValue);

        } else if (Age > 5) {
            CurrentValue = Price - ((50 / 100) * Price);

            System.out.println("Current Value : " + "Less then" + CurrentValue);

        } else {
            System.out.println("Current Value : " + "Not Found!");
        }

    }

    void PrintDetails() {
        System.out.println("Brand : " + Brand);
        System.out.println("Name : " + name);
        System.out.println("Vehicle Type : " + VehicleType);
        System.out.println("Year of Model : " + Model);
        System.out.println("Price : " + Price);
        System.out.println("Age : " + Age);
        // System.out.println("Current Value : ");
    }
}

public class DepreciationOfCar {

    public static void main(String[] args) {
        Depreciation obj1 = new Depreciation("Maruti Suziki", "Swift Dizire", "Car", 700000, 2022);
        obj1.PrintDetails();
        obj1.getCurrentValue();
    }
}
