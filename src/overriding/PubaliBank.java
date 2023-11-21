package overriding;
// creating derived class (inherits Super class BangladeshBank)
public class PubaliBank extends BangladeshBank {
    @Override
    int getRateOfInterest(){

        return 6;
    }
}
