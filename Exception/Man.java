import java.io.IOException;

public class Man extends Human{
    int velocity;
    public void transport() throws IOException,ArithmeticException{       
        super.transport();
        
        velocity = 12/0;
        
    }
}