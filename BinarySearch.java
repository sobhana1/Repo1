import java.util.Scanner;


public class BinarySearch {
	

	public static void main(String[] args) {
	int r,sum = 0,temp;
	int n=454;
	
	temp=n;
	while(n>0){
	r=n%10;
	sum=(sum*10)+r;
	n=n/10;
	}
	
	if(temp==sum){
		System.out.println("is a pallindrome");
System.out.println("is a pallindrome");
	}else System.out.println("not a pallindrome");
	}
		
}
