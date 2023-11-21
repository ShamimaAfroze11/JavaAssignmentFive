package Encapsulation;

public class Encapsulation {
    public static void main(String[] args) {
        // creating an object of the person class
        Person person = new Person();
        // using the public setter method to set the data
        person.setName("Shamima");
        person.setAge(26);
        // using the public setter method to access the data
        System.out.println("Name = " + " " + person.getName());
        System.out.println("Age = " + " " + person.getAge());

    }
}
