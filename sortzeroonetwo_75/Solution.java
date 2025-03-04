package sortzeroonetwo_75;

import java.util.Map;
import java.util.TreeMap;

class Solution {
    public void sortColors(int[] nums) {
        Map<Integer,Integer> m =new TreeMap<>();
        m.put(0,0);
        m.put(1,0);
        m.put(2,0);
        for(int i=0;i<nums.length;i++){
            if(m.containsKey(nums[i]))
            m.put(nums[i],m.get(nums[i])+1);
            else
            m.put(nums[i],1);
        }
        for(int i=0;i<nums.length;i++){
            if(i<m.get(0))
            nums[i]=0;
            else if(i>=m.get(0) && i<(m.get(0)+m.get(1)))
            nums[i]=1;
            else
            nums[i]=2;
        }
    }
}