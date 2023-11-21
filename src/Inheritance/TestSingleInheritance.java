package Inheritance;

public class TestSingleInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog(); // creating an object of the dog class
        // call the method and showing the values of this object
        dog.eating();
        dog.barking();
        dog.running();
        dog.weeping();
        dog.playing();
        System.out.println(dog.name);
        System.out.println(dog.age);
        System.out.println(dog.color);
        System.out.println(dog.breed);


    }
}
