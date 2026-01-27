package a_easy;

import java.util.HashMap;
import java.util.Map;

public class L3005_CountElementsWithMaxFreq {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(maxFrequencyElements(nums));
    }
    public static int maxFrequencyElements(int[] nums) {
        int n = nums.length;

        HashMap<Integer,Integer> map = new HashMap<>();
        int max = 0;
        for(int i =0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            max = Math.max(max,map.get(nums[i]));
        }

        int totalFreq = 0 ;
        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            if(e.getValue() == max) totalFreq += max;
        }

        return totalFreq;
    }
}
