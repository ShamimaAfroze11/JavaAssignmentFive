package abstraction;

public class AbstractTest{
    public static void main(String[] args) {
        // test class to create objects and call the methods
        CentralBank agraniBank = new AgraniBank();
        System.out.println("Agrani Bank Rate of Interest:"+" "+agraniBank.getRateOfInterest());
        System.out.println("Bank Account Name:"+" "+agraniBank.displayInfo("Shamima"));
        JanataBank janataBank = new JanataBank();
        System.out.println("Janata Bank Rate of Interest:"+" "+janataBank.getRateOfInterest());
        System.out.println("Bank Account Name:"+" "+janataBank.displayInfo("Shamim"));
        CentralBank rupaliBank = new RupaliBank();
        System.out.println("Rupali Bank Rate of Interest:"+" "+rupaliBank.getRateOfInterest());
        System.out.println("Bank Account Name:"+" "+rupaliBank.displayInfo("Sourav"));

    }


        }
