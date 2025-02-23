package com.string;

public class Defanging{
	public static void main(String[] ar){
		String address = "1.1.1.1";
		for(int i = 0; i<address.length(); i++){
			
			if(address.charAt(i) == '.'){
				System.out.print("["+address.charAt(i)+"]");
			}
			else{
				System.out.print(address.charAt(i));
			}
		}
	}
}