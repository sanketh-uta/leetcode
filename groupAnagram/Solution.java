package groupAnagram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> m = new HashMap<>();
        for(String s : strs){
            int[] count = new int[26];
            for(char ch : s.toCharArray()){
                count[ch - 'a']++;
            }
            StringBuilder str = new StringBuilder();
            for(int x : count){
                str.append(x).append('$');
            }
            if(!m.containsKey(str.toString()))
            m.put(str.toString(),new ArrayList<String>());
            m.get(str.toString()).add(s);
        }
        return new ArrayList<>(m.values());
    }
}
