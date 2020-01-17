import java.io.IOException;

public class Human{
    int velocity;
    public void transport() throws IOException{
        velocity = 12;
        System.out.println("by Walk "+ velocity);
        throw new IOException();
        //throw new ArithmeticException();   only one throw allowd
    }
}