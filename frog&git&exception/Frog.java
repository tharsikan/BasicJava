public class Frog{
    public static int calculateTime(int distance){
        int t = 0;
        int n = distance/9;
        if(distance%9==0){  
            t = n*8 - 5;
        }else if(distance%9<=5){
            t= n*8;
        }else{
            t= n*8+1;
        }
        return t;
    }
    public static int calculateDistance(int time){
        int d = 0;
        int n = time/8;
        if(time%8==0){  
            d = n*9 + 5;
        }else if(time%8>=3){
            d = n*9 + 5 + 4;
        }else if(time%8>=1){
            d = n*9 + 5 + 3;
        }
        return d;
    }
    public static void main(String[] args) {
        System.out.println(calculateTime(29)); 
        System.out.println(calculateDistance(3));
    }
}