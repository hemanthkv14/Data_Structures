/*
	Program to find factorial of a given number
	fact(5) : 5*4*3*2*1 = 120

	Test  Case : 0
	Input : 6
	Output: 720
*/
import java.util.Scanner;
class Fact_Normal{
	public static void main(String[] v){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt(),f=1;
		/**
			if n is negetive print error else if n is 0 print 0
			while loop :
				multiplies the n value to f and assigns to f
				decrements f
			executes upto the n value is positive
		**/
		if(n<0)	System.out.println("Value cannot be negetive");
		else if(n==0)	System.out.println(0);
		else{
			while(n>0){
				f*=n;
				n--;
			}
			System.out.println(f);
		}
	}
}