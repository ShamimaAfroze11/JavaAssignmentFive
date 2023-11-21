package overriding;
// creating derived class (inherits Super class BangladeshBank)
public class KrishiBank extends BangladeshBank {
    @Override
    int getRateOfInterest() {
        return 4;
    }
}
