package mytrails;

import java.util.Scanner;

public class sos {
	int f(int n) {
		if(n==1) {
			return 1;
			}else {
			return n+f(n-1);}
	}
	public static void main(String []arg) {
		sos n=new sos();
		System.out.println("please enter the number :");
		int m=new Scanner(System.in).nextInt();
		System.out.println(n.f(m));
	}
}
