package com.string;

public class Defanging1 {
    public String defangIPaddr(String address) {
    	
    	address = address.replace(".", "[.]");
        return address;
    }
    
    public static void main(String[] ar) {
    	Defanging1 obj = new Defanging1();
    	String address = "1.1.1.1";
    	obj.defangIPaddr(address);
    	System.out.println(obj.defangIPaddr(address));
    }
}
