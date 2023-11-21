package InterfaceExample;

public interface Output extends Showable, Printable{
    @Override
    default void print(){
        System.out.println("Account Number");
    }

    @Override
    default void show(){
        System.out.println("Account Name");
    }
}
