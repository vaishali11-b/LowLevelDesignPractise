package DesignPatterns.CreationalPatterns.PrototypeDesign;

//old way of creating object using constructor and then cloning it using copy constructor
//it had some issues like if we have to change the constructor then we have to change the copy constructor as well and it is not efficient as well
//1. fields might be private and we cannot access them directly
//2. if we have to change the constructor then we have to change the copy constructor as well and it is not efficient as well
public class Prototype1 {
    public static void main(String[] args) {
            Student obj = new Student(20, "John", 101);
            Student cloneObject = new Student(obj.age, obj.name, obj.rollNo);
    }
public class Student{
    int age;
    String name;
    private int rollNo;

    public Student(int age, String name, int rollNo) {
        this.age = age;
        this.name = name;
        this.rollNo = rollNo;
    }
}
//new way of creating object using clone method
//it is more efficient and we don't have to change the constructor if we want to change the fields of the class
public class Prototype2 {
    public static void main(String[] args) {
        Student obj = new Student(20, "John", 101);
        Student cloneObject = (Student) obj.clone();
    
}
public class Student implements PrototypeInterface{
    int age;
    String name;
    private int rollNo;     

    public Student(int age, String name, int rollNo) {
        this.age = age;
        this.name = name;
        this.rollNo = rollNo;
    }
   @Override
    public PrototypeInterface clone() {
        return new Student(this.age, this.name, this.rollNo);
    }
}

