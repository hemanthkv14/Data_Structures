/*
	Program to find factorial of a given number
	fact(5) : 5*4*3*2*1 = 120

	Test  Case : 0
	Input : 6
	Output: 720
*/
import java.util.Scanner;
class Fact_Recursive{
	public static void main(String[] v){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		// fact(n) method returns the factorial of given number
		System.out.println(fact(n));
	}
	static int fact(int n){
		/**
			Input : n
			Output: return factorial of n

			if n is 1 return 1
			else multiply n with factorial of (n-1) which itself is (n-1) * (n-1-1) and so on upto n is 1
		**/
		if(n==1)	return n;
		return n*fact(n-1);
	}
}