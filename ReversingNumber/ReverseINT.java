import java.lang.Math;
public class ReverseINT{
	public static int reverse(int num){
		int n =0;
		int sum=0;
		int i =0;
		int x = num;
		while(x/10!=0){
			x=x/10;
			i++;
		}
		while(num/10!=0){
			n = num%10;
			n = (int) ( n * Math.pow(10, i));
			System.out.println(n);
			sum=sum+n;
			num = num/10;
			i--;
		}
		sum=sum+num;
		return sum;
	}
	public static void main(String arg[]){
		System.out.println("Hello Guru");
		System.out.println(reverse(004));
	}
}