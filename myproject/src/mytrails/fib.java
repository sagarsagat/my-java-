package mytrails;

import java.util.Scanner;

public class fib {
	void fi(int n) {
		int c,a=0,b=1;
		for(int i=0; i<n;i++) {
			if(i==0) {
				System.out.println("1");
				}else {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;}
		}
		System.out.println();
	}
	public static void main(String []arg) {
		fib n= new fib();
		System.out.println("please enter the number :");
		int m=new Scanner(System.in).nextInt();
		n.fi(m);
	}
}
