package DSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MedianOfTwoSortsArray008 {
public double findMedianSortedArrays(int[] nums1, int[] nums2) {
	double median = 0 ;
	List<Integer> l = new ArrayList<>();
	for(int a : nums1) {
		l.add(a);
	}
	for(int b : nums2) {
		l.add(b);
	}
	
	Collections.sort(l);
	 int len = l.size();
	 
	 if(len%2 == 0) {
		 median = (l.get((len/2)-1) + l.get(len/2))/2.0;
	 }
	 else {
		 median = l.get(len/2);
	 }
	return median;
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums1 = {1,2}; 
		int []nums2 = {3,4};
		MedianOfTwoSortsArray008 obj = new MedianOfTwoSortsArray008();
		System.out.println(obj.findMedianSortedArrays(nums1, nums2));
	}

}
