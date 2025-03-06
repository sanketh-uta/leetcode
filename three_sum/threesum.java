// finding all the triplets whose sum is either 0 or given for now consider 0
package three_sum;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threesum {
    static List<List<Integer>> findtriplets(int[] a){
        List<List<Integer>> l = new ArrayList<>();
        for(int i=0;i<a.length-2;i++){
            if(i>0 && a[i-1]==a[i]){
                continue;
            }
            int complement = -a[i];
            int left = i+1;
            int right = a.length-1;
            while(left<right){
                int sum = a[left]+a[right];
                if(sum<complement){
                    left++;
                }
                else if(sum>complement){
                    right--;
                }
                else if(sum==complement){
                    List<Integer> la = new ArrayList<>();
                    la.add(a[i]);
                    la.add(a[left]);
                    la.add(a[right]);
                    l.add(la);
                    while(sum<0 && a[left+1]==a[left]){
                        left++;
                    }
                    while(sum>0 && a[right-1]==a[right]){
                        right--;
                    }
                    left++;
                    right--;
                }
            }
        }
        return l;
    }
    public static void main(String[] args) {
        int[] a = {-1, 0, 1, 2, -1, -4};
        Arrays.sort(a);
        List<List<Integer>> res = findtriplets(a);
        System.out.println(res);
    }
}
