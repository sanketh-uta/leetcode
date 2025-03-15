package Fruits_into_basked_easy.Fruits_into_basked_easy;

import java.util.Arrays;

class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length;
        int placed = 0;
        boolean[] visited = new boolean[n];
        Arrays.fill(visited,false);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(fruits[i]<=baskets[j] && visited[j]==false){
                    placed++;
                    visited[j] = true;
                    break;
                }
            }
        }
        return n-placed;
    }
}
