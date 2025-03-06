package maxsubarrayaverage_643;

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        for(int i=1;i<nums.length;i++){
            nums[i]+=nums[i-1];
        }
        double max = nums[k-1];
        int p = 1;
        for(int j=k;j<nums.length;j++){
            if(nums[j]-nums[p-1]>max){
                max = nums[j]-nums[p-1];
            }
            p++;
        }
        return max/k;
    }
}