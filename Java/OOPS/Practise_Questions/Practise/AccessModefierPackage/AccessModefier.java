// Create a class Student with properties like name, rollNumber, and grade. Use different access modifiers (private, protected, public, default) for these properties. Write a class in the same package and another in a different package to test access to these properties.
package AccessModefierPackage;

class Student {
    public String name;
    protected int rollNo;
    char grade;
    private int age;
}

public class AccessModefier {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.name = "Sanjib";
        obj.rollNo = 12;
        obj.grade = 'A';
        System.out.println(obj.name);
        // obj.age = 12; this will not work

    }
}
