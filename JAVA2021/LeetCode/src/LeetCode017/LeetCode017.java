package LeetCode017;

import java.util.*;

class Solution {
    List<String> res = new ArrayList<>();
    StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Solution s = new Solution();
        List<String> ls = s.letterCombinations("23");
        for(String str: ls){
            System.out.println(str);
        }
    }

    public List<String> letterCombinations(String digits) {
        if("".equals(digits)){
            return new ArrayList<>();
        }

        HashMap<Character, char[]> hmp = new HashMap<>();
        hmp.put('2', new char[]{'a', 'b', 'c'});
        hmp.put('3', new char[]{'d', 'e', 'f'});
        hmp.put('4', new char[]{'g', 'h', 'i'});
        hmp.put('5', new char[]{'j', 'k', 'l'});
        hmp.put('6', new char[]{'m', 'n', 'o'});
        hmp.put('7', new char[]{'p', 'q', 'r', 's'});
        hmp.put('8', new char[]{'t', 'u', 'v'});
        hmp.put('9', new char[]{'w', 'x', 'y', 'z'});
        ArrayList<char[]> chars = new ArrayList<>();
        for(char c: digits.toCharArray()){
            chars.add(hmp.get(c));
        }
        backTrack(chars, 0, digits.length());
        return res;
    }

    public void backTrack(ArrayList<char[]> chars, int top, int required){
        if(top==required){
            res.add(sb.toString());
            return;
        }
        for(char c: chars.get(top)){
            sb.append(c);
            backTrack(chars, top+1, required);
            sb.deleteCharAt(top);
        }
    }
}