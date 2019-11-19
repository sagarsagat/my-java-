package mytrails;

import java.io.*;
import java.util.Scanner;

public class Testthread {
	int top=-1 ,max=3;
	int a[]=new int[max];
	
	void  push(int ele)
	{
		if(top==max-1)
		{
			System.out.println("stack is full");
			System.exit(0);
			
		}
		a[++top]=ele;
		System.out.println(ele+" is successfully inserted ");
	}
	void pop()
	{
		if(top==-1)
		{
			System.out.println("stack is empty");
			System.exit(0);
			
		}
		int pit=a[top--];
		System.out.println(pit+" is successfully poped ");
	}
	void display()
	{
		if(top>-1) {
			for(int i=top; i>-1; i--)
				System.out.println(a[i]);	
		}
	}
	public static void main(String []arg) {
		Testthread s=new Testthread();
		int n,m=1;
		while(m>0) {
		Scanner n1=new Scanner(System.in);
		System.out.println(" 1. push \n 2. pop \n 3. display \n 4. exit");
		System.out.println("please enter the choice :");
		n=n1.nextInt();
		
			switch(n) {
		
		case 1:System.out.println("please enter number you want to push:");
			   m=n1.nextInt();
			  s. push(m);
			  break;
		case 2:	
				s. pop();
				break;
		case 3:s.display();
				break;
		case 4:	System.out.println("Thank you");
				System.exit(0);	
		default:System.out.println(" please enter valid option");
				break;
				
		}
	
	
	}

}}
