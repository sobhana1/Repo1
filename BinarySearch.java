import java.util.Scanner;


public class BinarySearch {
	

	public static void main(String[] args) {
		int n,array[],c,first,last,middle,search;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of Elements");
		n=sc.nextInt();
		array=new int[n];
		
		System.out.println("Enter"+n+"numbers");
		
		for(c=0;c<n;c++){
			array[c]=sc.nextInt();
		}
		
		System.out.println("Enter a number to search");
		search=sc.nextInt();
		first=0;
		last=n-1;
		middle=(first+last)/2;
		
		while(first <last){
			if(array[middle]< search){
				first=middle +1;
			}else if(array[middle] == search){
				System.out.println("Found");
			}else last=middle - 1;
			
			middle=(first+last)/2;
		}
		
		if(first > last){
			System.out.println("Not found");
		}
		
	}

}
