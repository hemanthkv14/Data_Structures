/*
	Program to print fibbonacci series upto the given number

	Test Case : 0
	Input :	25
	Output: 0 1 1 2 3 5 8 13 21
*/
import java.util.Scanner;
class Fibb_Recursive{
	public static void main(String[] v){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a=0,b=1;
		System.out.print(a+" ");
		fibb(a,b,n);
	}
	static void fibb(int a,int b,int n){
		/**
			Input : a=0, b=1, n=limit.

			each recursion changes the value of a, b to b, a+b
			for b i.e a+b < n the method prints b and call the method itself with new updated a and b values (b, a+b)
			if a+b > n it prints b and does not call any method
		**/
		if(a+b>n)	System.out.println(b);
		else{
			System.out.print(b+" ");
			fibb(b,a+b,n);
		}
	}
}
