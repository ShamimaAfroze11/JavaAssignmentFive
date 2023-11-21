package abstraction;
//derived class RupaliBank inherits super class CentralBank
public class RupaliBank extends CentralBank {
    @Override
    int getRateOfInterest() {
        return 9;
    }
}
