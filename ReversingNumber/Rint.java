import java.lang.Math;
public class Rint{
	public static int reverse(int num){
		String nu = ""+num;
		String su="";
		int len = nu.length();
		int x = num;
		char c ;
		System.out.println(nu);
	for(int i=len-1;i>=0;i--){
		c = nu.charAt(i);
		su = su + c;
	}
		int sum = Integer.parseInt(su);	
		return sum;
	}
	public static void main(String arg[]){
		System.out.println("Hello Guru");
		System.out.println(reverse(060));
	}
}