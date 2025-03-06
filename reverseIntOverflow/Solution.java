package reverseIntOverflow;
class Solution {
    public int reverse(int x) {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        int rev = 0;
        while(x!=0){
            int d = x%10;
            x=x/10;
            if(rev>max/10 || (rev==max/10 && d>7))
            return 0;
            if(rev<min/10 || (rev==min/10 && d>8))
            return 0;
            rev = rev * 10 +d;
        }
        return rev;

    }
}