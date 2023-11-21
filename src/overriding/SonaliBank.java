package overriding;
//creating derived class (inherits Super class BangladeshBank)
public class SonaliBank extends BangladeshBank{
    @Override
    int getRateOfInterest(){
        return 5;

    }
}
