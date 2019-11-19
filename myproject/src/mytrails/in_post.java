package mytrails;

import java.util.Scanner;

public class in_post {
	int  f(char sym) {
switch(sym) {
		
		case '-':
		case '+':return 2;	
		case '/':
		case '*':return 4;
		case '^':
		case '$':return 5;
		case '(':return 0;
		case '#':return -1;
		default:return 8;
				
		}

	}
	int  g(char sym) {
switch(sym) {
		
		case '-':
		case '+':return 1;	
		case '/':
		case '*':return 3;
		case '^':
		case '$':return 6;
		case '(':return 9;
		case ')':return 0;
		default:return 7;
				
		}
		
	}

	
	void infix_post(char infix[],char postfix[]) {
		
		int i=0,j=-1,top=-1;
		char s[]=new char[20];
		s[++top]='#';
		for(i=0;i<infix.length;i++)
		{
			char symbol=infix[i];
		while(f(s[top])>g(symbol)) {//poh
			postfix[++j]=s[top--];
			
		}
		if(f(s[top])!=g(symbol)){
			s[++top]=symbol;
		}else {
			top--;
		}
		
		}
		 if(s[top]!='#') {
			 postfix[++j]=s[top--];
		 }
		
		
	}
	
	public static void main(String []arg) {
		char infix[], postfix[]=new char[20];
		System.out.println("please enter valid infix expression :");
		infix=new Scanner(System.in).next(pattern)
		
	}
}
