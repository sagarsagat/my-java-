package mytrails;

import java.util.Scanner;

public class ron {
	void reverse(int n) {
		int rev=0;
		while(n>0) {
		int last=n%10;
		
		rev=rev*10+last;
		n=n/10;
		}
		System.out.println(rev);
	}
	public static void main(String []arg) {
		ron n= new ron();
		System.out.println("please enter the number :");
		int m=new Scanner(System.in).nextInt();
		n.reverse(m);
	}
}
