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
class BinarySearch_Recursive{
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
		System.out.println(binarySearch(ar,0,ar.length-1,e)?"Found":"Not Found");
		/**
			if mid is the required element is returns found
			else
			it adjust the mid index according to the element
				if mid value is bigger than element mid index becomes new higher index and the binarySearch method is again called
				if mid value is smaller than element mid index becomes new lower index and the binarySearch method is again called
		**/
	}
		static boolean binarySearch(int[] ar,int l,int h,int e){
			if(h>=l){
				int m=(l+h)/2;
				if(ar[m]==e)	return true;
				else if (ar[m]<e) return binarySearch(ar,m+1,h,e);
				else if (ar[m]>e) return binarySearch(ar,l,m-1,e);
			}
			return false;
		}
}