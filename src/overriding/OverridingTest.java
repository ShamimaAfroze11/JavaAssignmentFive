package overriding;
public class OverridingTest {
    public static void main(String[] args) {
        // test class to create objects and call the methods
       KrishiBank krishiBank = new KrishiBank();
       System.out.println("Krishi Bank Rate of Interest:"+ " " +krishiBank.getRateOfInterest());
       SonaliBank sonaliBank = new SonaliBank();
       System.out.println("Sonali Bank Rate of Interest:"+ " " +sonaliBank.getRateOfInterest());
       PubaliBank pubaliBank = new PubaliBank();
       System.out.println("Pubali Bank Rate of Interest:"+ " " +pubaliBank.getRateOfInterest());
    }


}
