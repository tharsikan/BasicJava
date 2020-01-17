import java.io.IOException;

public class Runner{
    int velocity;
    public void transport(){
        Man m = new Man();
        try{
            m.transport();
        }
        catch(IOException e){
            System.out.println("io exception catched!!");
            try{
                throw new ArithmeticException();
            }
            catch(ArithmeticException ae){
                System.out.println("ae exception catched!!");
            }
        }
    }
}