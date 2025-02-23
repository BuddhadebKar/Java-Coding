//https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/description/

package Array;

import java.util.ArrayList;
import java.util.List;

public class minAvgOfSmallestLargestEle {
    public double minimumAverage(int[] nums) {
        List<Double> averages = new ArrayList<>();
        
        List<Integer> l = new ArrayList<>();
        for (int num : nums) {
            l.add(num);
        }
        
        int n = l.size();
        for (int j = 0; j < n / 2; j++) {
            int largest = l.get(0);
            int smallest = l.get(0);
            int la = 0, s = 0;
            
            for (int i = 1; i < l.size(); i++) {
                if (l.get(i) > largest) {
                    largest = l.get(i);
                    la = i;
                }
                if (l.get(i) < smallest) {
                    smallest = l.get(i);
                    s = i;
                }
            }
            
            double avg = (largest + smallest) / 2.0;
            averages.add(avg);
            
            // Remove the largest element first to avoid index shifting issues
            if (la > s) {
                l.remove(la);
                l.remove(s);
            } else {
                l.remove(s);
                l.remove(la);
            }
        }
        
        double minimumAverage = Double.MAX_VALUE;
        for (double avg : averages) {
            if (avg < minimumAverage) {
                minimumAverage = avg;
            }
        }
        
        return minimumAverage;
    }

    public static void main(String[] args) {
        minAvgOfSmallestLargestEle obj = new minAvgOfSmallestLargestEle();
        int[] nums = {7, 8, 3, 4, 15, 13, 4, 1};
        System.out.println(obj.minimumAverage(nums)); // Expected output: 5.5
    }
}
