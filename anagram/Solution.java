package anagram;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> m = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!m.containsKey(ch))
            m.put(ch,1);
            else
            m.put(ch,m.get(ch)+1);
        }
        for(int j=0;j<t.length();j++){
            char ch = t.charAt(j);
            if(m.containsKey(ch))
            m.put(ch,m.get(ch)-1);
            else
            return false;
        }
        for(int v:m.values()){
            if(v!=0)
            return false;
        }
        return true;
    }
}