import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

class Iterationn{
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1,2,3,4,5,6);
System.out.println("**************(External Iterations)*********************");      
        for (int i = 0; i < 6; i++) {
            System.out.print(values.get(i));
        }
System.out.println("****************Old********************");
        for(int i : values){
            System.out.print(i);
        }
System.out.println("***************Enhance for*********************");
        Iterator<Integer> i= values.iterator();
        while(i.hasNext()){
            System.out.print(i.next());
        }
System.out.println("***************Iterator*********************");
System.out.println("\n****************Stream (External Iterations)********************");
        values.forEach(j-> System.out.print(j));
System.out.println();
        Consumer<Integer> c= n -> System.out.print(n);                      // functional Interface ->
        // Consumer<Integer> cc = new Consumer<>(){
        //     public void accept(Integer i){
        //         System.out.print(i);
        //     }
        // };
        values.forEach(c);
    }
}