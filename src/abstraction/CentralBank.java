package abstraction;
// super class
public abstract class CentralBank {
    // abstract method (does not have a body)
    abstract int getRateOfInterest();
    // non abstract method or regular method
    public String displayInfo(String Accountname){
        return Accountname;
    }

}
