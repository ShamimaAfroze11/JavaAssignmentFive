package InterfaceExample;

public class InterfaceTest {
    public static void main(String[] args) {
        Output output = new Output() {
            @Override
            public void print() {
                Output.super.print();
            }
        };
        output.show();
        output.print();
        EximBank eximBank = new EximBank();
        System.out.println(eximBank.rateOfInterest());

        }
    }

