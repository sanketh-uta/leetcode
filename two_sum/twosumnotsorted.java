//Assuming only one possible solution and the array elements are not sorted

import java.util.Arrays;
import java.util.HashMap;

class twosumnotsorted{
    static int[] findIndex(int[] a, int target){
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<a.length;i++){
            int complement = target - a[i];
            if(m.containsKey(complement)){
                return new int[]{i,m.get(complement)};
            } 
            else
            m.put(a[i],i);
        }
        return new int[]{};
    }
    public static void main(String args[]){
        int[] a = {2,1,0,4,6,3};
        int target = 10;
        int[] res = findIndex(a,target);
        System.out.println(Arrays.toString(res));
    }
}