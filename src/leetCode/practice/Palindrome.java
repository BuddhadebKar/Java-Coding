package leetCode.practice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for palindrom check : ");
		int plnd = sc.nextInt() ;
		  int r,sum=0,temp;    
		  
		  temp = plnd;
		
		while(plnd!=0) {
			 r=plnd%10;  //getting remainder  
			   sum=(sum*10)+r;    
			   plnd=plnd/10;    
		}
		
		if(temp==sum) {    
			   System.out.println("palindrome number ");    
		}
		else {
			   System.out.println("not palindrome");    
		}
			}  
	}

