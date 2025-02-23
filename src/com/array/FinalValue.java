package com.array;

import java.util.Scanner;
public class FinalValue{
	public static void main(String[] ar){
		int x = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("You have only 3/4 choise....");
		int choise = sc.nextInt();
		
		
		while(choise>0){
			System.out.println("Enter operation : ");
			String operation = sc.next();
			switch(operation){
				case "--x":
						--x;
						break;
				case "++x":
						++x;
						break;
				case "x--":
						x--;
						break;
				case "x++":
						x++;
						break;
				default :
						System.out.println("Invalid!");
						break;
			}
			choise--;
		}
		System.out.println(x);
	}
}