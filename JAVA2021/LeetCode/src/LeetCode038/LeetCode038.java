package LeetCode038;


class Solution {
    public String countAndSay(int n) {
        String pre = "1";
        for(int i=1; i<n; i++){
            pre = convert(pre);
        }
        return pre;
    }

    public String convert(String num){
        char pre = num.charAt(0);
        int count = 1;
        char[] chars = num.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<chars.length; i++){
            if(chars[i]==pre){
                count += 1;
            }else{
                sb.append(count);
                sb.append(pre);
                pre = chars[i];
                count = 1;
            }
        }
        sb.append(count);
        sb.append(pre);
        return sb.toString();
    }
}
