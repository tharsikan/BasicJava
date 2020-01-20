import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class MySorting{
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1113,1227,3236,1142,5219,6325);
       
        Comparator<Integer> c = new Comparator<Integer>(){   // <>() not working
                public int compare(Integer n1, Integer n2) 
                {
                    if(n1%100>n2%100) return +1;
                    if(n1%100<n2%100) return -1;
                    return 0;           
                }
         };
        Comparator<Integer> cc = (n1,n2) ->{
                if(n1%100>n2%100) return +1;
                if(n1%100<n2%100) return -1;
                return 0;           
        };
        
        Collections.sort(values, cc);
        // values.sort(c);      working
        for(int i:values){
            System.out.println(i);
        }
    }
}