package two_sum;
import java.util.Arrays;

public class twosumsorted {
    static int[] findIndex(int[] a,int target){
        int left = 0;
        int right = a.length-1;
        while(left<right){
            int sum = a[left]+a[right];
            if(sum>target){
                right--;
            }
            else if(sum<target){
                left++;
            }
            else if(sum==target){
                return new int[]{left,right};
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] a = {0,1,3,4,8,9};
        int target = 7;
        int[] res = findIndex(a,target);
        System.out.println(Arrays.toString(res));
    }
}
