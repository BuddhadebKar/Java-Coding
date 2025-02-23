package Codes;

public class BinaryStringOperation {
	int binaryOperation(String s) {
		
		int storage = Integer.parseInt(s.substring(0,1),2);
		
		
		for(int i = 1; i< s.length(); i++) {
			int nextChar = Integer.parseInt(s.substring(i+1,i+2),2);
			char ch = s.charAt(i);
			switch(ch) {
			
				case 'A' : 
					storage &= nextChar;
					break;
				
				case 'B' : 
					storage |= nextChar;
					break;
				case 'C' : 
					storage ^= nextChar;
					break;
			}
			i++;	
		}
		return storage;
	}
	public static void main(String[] args) {
		BinaryStringOperation obj = new BinaryStringOperation();
		String s = "1C0C1C1A0B1";
		System.out.println(obj.binaryOperation(s));
	}
}
