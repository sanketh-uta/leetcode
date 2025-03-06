package removeDuplicates;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> unique_int = new HashSet<>();
        int slow = 0;
        for(int fast=0;fast<nums.length;fast++){
            if(!unique_int.contains(nums[fast])){
                unique_int.add(nums[fast]);
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
}