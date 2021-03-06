package LeetCode014;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

/**
 * 14. 最长公共前缀
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 */

/**
 * 横向扫描
 */
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res = null;
        for (String str : strs) {
            res = longestCommonPrefix(res, str);
        }
        return res==null ? "" : res;
    }

    public String longestCommonPrefix(String str1, String str2){
        if(str1==null){
            return str2;
        }
        int i = 0;

        while(i<Math.min(str1.length(), str2.length())){
            if(str1.charAt(i)!=str2.charAt(i)){
                break;
            }
            i++;
        }
        return str1.substring(0, i);
    }
}

/**
 * 纵向扫描
 */
class Solution2 {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        int length = strs[0].length();
        int count = strs.length;
        for (int i = 0; i < length; i++) {
            for (int j = 1; j < count; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != strs[0].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}


