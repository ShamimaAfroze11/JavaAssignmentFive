package abstraction;
// derived class AgraniBank inherits super class CentralBank
public class AgraniBank extends CentralBank {
    @Override
    int getRateOfInterest() {
        return 10;
    }
}
