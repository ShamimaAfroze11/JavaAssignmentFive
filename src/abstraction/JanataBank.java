package abstraction;
// derived class AgraniBank inherits super class CentralBank
public class JanataBank extends CentralBank {
    @Override
    int getRateOfInterest() {
        return 8;
    }
}
