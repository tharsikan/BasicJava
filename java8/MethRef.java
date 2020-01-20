import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

class MethRef{
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1,2,3,4,5,6);
        values.forEach(j-> System.out.print(j)); // forEach you give all values as i, i do something in my method 
        values.forEach(System.out::print);  // // forEach you give all values, myMethod Ref get and use it
        values.forEach(MethRef::myMethod);
        values.stream().forEach(MethRef::myMethod);
        values.stream().filter(i->{System.out.println("helo");return true;}); // water folloing not out put here (filter intermediat)
        System.out.println(values.stream().findFirst());//(i->{System.out.println("helo");return true;});
        values.stream().filter(i->{System.out.println("helo");return true;}).forEach(System.out::print); // forEach terminate
    }
    static void myMethod(Integer t){
        System.out.println(t*2);
    }
}