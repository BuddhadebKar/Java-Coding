package com.array;

public class FinalValue1 {
    public int finalValueAfterOperations(String[] operations) {
    	int x = 0;
		int i = operations.length;
		
		
		while(i>0){
			String at = operations[i-1];
			switch(at){
			case "--X": 
						--x;
						 at = null;
						break;
						
				case "++X":
						++x;
						at = null;
						break;
						
				case "X--":
						x--;
						at = null;
						break;
						
				case "X++":
						x++;
						at = null;
						break;
						
				default :
						System.out.println("Invalid!");
						break;
			}
			i--;
		}
        return x;
    }
    
    public static void main(String[] ar) {
    	FinalValue1 obj = new FinalValue1();
    	String[] operations = {"--X","X++","X++"};
    	int result = obj.finalValueAfterOperations(operations);
    	System.out.println(result);
    }
}
