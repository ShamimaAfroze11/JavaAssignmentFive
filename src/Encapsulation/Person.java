package Encapsulation;

public class Person {
    // private data members
    private String name;
    private int age;
    // public setter method for name
    public void setName(String personName){
        this.name = personName;
    }
    // public getter method for name
    public String getName(){
        return name;
    }
    // public setter method for age
    public void setAge(int personAge){
        this.age = personAge;
    }
    // public getter method for age
    public int getAge(){
        return age;
    }
}
