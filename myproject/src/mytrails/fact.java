package mytrails;

import java.util.Scanner;

public class fact {
	int f(int n) {
		if(n==1) {
			return 1;
			}else {
			return n*f(n-1);}
	}
	public static void main(String []arg) {
		fact n=new fact();
		System.out.println("please enter the number :");
		int m=new Scanner(System.in).nextInt();
		System.out.println(n.f(m));
	}
}
