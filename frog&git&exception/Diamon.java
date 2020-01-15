import java.util.Scanner;
public class Diamon{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter length of Diamon : ");
        int k = sc.nextInt();
        sc.close();
        for (int i = k; i >0 ; i--) {
            for (int j = 0; j < k; j++) {
                if(i>j)System.out.print(" ");
                else System.out.print("*");
            }
            for (int j = 0; j < k; j++) {
                if(i<j)System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < k-1; i++) {
            System.out.print(" ");
            for (int j = 0; j < k-1; j++) {
                if(i<j)System.out.print("*");
                else System.out.print(" ");
            }
            for (int j = 0; j < k-2; j++) {
                if(i<j)System.out.print("*");
            }
            System.out.println();
        }
    }
}