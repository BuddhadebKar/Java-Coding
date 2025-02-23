package Practice;

public class MidFind{
	public static void main(String[] arg){
		int[] arr = { 7 , -3, 8, 2, -5, 10, 12};
		int l = arr.length;
		int mid1 = 0; 
		for( int i = 0; i < l; i++ ){
			if( arr[i] < 0 ){
				for( int j = i; j < l-1; j++ ){
					arr[j] = arr[j+1];
				}
				l--;
			}
		}
		if( ( l % 2) != 0 ){
			mid1 = arr[l/2];
		}
		else{
			mid1 = arr[l/2];
			
		}
		
		System.out.println(mid1);

	}

}
