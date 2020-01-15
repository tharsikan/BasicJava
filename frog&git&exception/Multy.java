public class Multy{
    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                if(i==0)System.out.print(j+"     ");
                if(j==0 && i!=0)System.out.print(i+"     ");
                if(j!=0 && i!=0){
                    if(i*j<10)System.out.print("0"+i*j+"    ");
                    else System.out.print(i*j+"    ");
                }
            }
            System.out.println();
        }
    }
}