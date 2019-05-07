/*
	Program to print fibbonacci series upto the given number

	Test Case : 0
	Input :	25
	Output: 0 1 1 2 3 5 8 13 21
*/
import java.util.Scanner;
class Fibb_Normal{
	public static void main(String[] v){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a=0,b=1;
		System.out.print(a+" ");
		/**
			loop executes until the b value is less than the given 'n' value
		**/
		while(b<n){
			System.out.print(b+" ");
			int t=a;
			a=b;
			b=t+b;
		}
	}
}
