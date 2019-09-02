package com.vangoleo.leetcode.algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * @author leiwei
 * @date 2019/09/02
 */
public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        // key: char, value: index
        Map<Character, Integer> indexByChar = new HashMap<>();
        for(int i = 0, j = 0; j < s.length(); j ++){
            if(indexByChar.containsKey(s.charAt(j))){
                i = indexByChar.get(s.charAt(j)) + 1;
            }
            indexByChar.put(s.charAt(j),j);
            result = Math.max(result, j - i + 1);
        }

        return result;
    }
}
