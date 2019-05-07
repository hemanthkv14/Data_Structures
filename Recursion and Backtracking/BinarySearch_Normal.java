/*
	Program to find an element in an sorted array using binary Search technique
	Input : Size of array Array elements and element to find
	Output: Found or Not Found

	Test Case : 0
	Input : 5
			1 5 6 7 9
			6
	Ouput : Found
*/
import java.util.Scanner;
class BinarySearch_Normal{
	public static void main(String[] v){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] ar=new int[n];
		for (int i=0;i<n;i++)	ar[i]=in.nextInt();
		//sort the array
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(ar[i]>ar[j]){
					int t=ar[i];
					ar[i]=ar[j];
					ar[j]=t;
				}
			}
		}

		//element to be found
		int e=in.nextInt();
		//binary search
		int l=0, h=n-1,m;
		boolean b=false;
		/**
			while loop executes upto the lower index is less than the higher index
			it takes the indexes of the array low mid and high
			if mid is the required element is print found
			else
			it adjust the mid index according to the element
				if mid value is bigger than element mid index becomes new higher index
				if mid value is smaller than element mid index becomes new lower index
			if higher becomes smaller than lower then the element is not found
		**/
		while(h>=l){
			m=(l+h)/2;
			if(ar[m]==e){
				b=true;
				System.out.println("Found");
				break;
			}
			else if(ar[m]<e)	l=m+1;
			else if(ar[m]>e)	h=m-1;
		}
		if(!b)	System.out.println("Not Found");
	}
}