package LeetCode005;

/**
 * 动态规划
 */
class Solution1 {
    public String longestPalindrome(String s) {
        int n = s.length();
        if(n<2){
            return s;
        }
        char[] chars = s.toCharArray();
        int maxLength = 1;
        int begin = 0;
        // 保存s(i, j)是否为回文
        boolean[][] isManacher = new boolean[n][n];
        for(int i=0;i<n;i++){
            isManacher[i][i] = true;
        }

        // 子串长度
        for(int L=2;L<=n;L++){
            // 左边界
            for(int i=0;i<n-L+1;i++){
                // 右边界
                int j = i + L - 1;
                if(chars[i]==chars[j]){
                    if(L<=3){
                        isManacher[i][j] = true;
                    }else{
                        isManacher[i][j] = isManacher[i+1][j-1];
                    }
                }
                else{
                    isManacher[i][j] = false;
                }
            }
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(isManacher[i][j]){
                    if(j-i+1 > maxLength){
                        maxLength = j-i+1;
                        begin = i;
                    }
                }
            }
        }
        return s.substring(begin, begin+maxLength);
    }
}


/**
 * 中心扩展法
 */
class Solution2{
    public String longestPalindrome(String s) {
        int begin = 0, length = 0;
        char[] chars = s.toCharArray();
        for(int i=0;i<s.length();i++){
            // 奇数长度情况
            int len1 = expandAroundCenter(chars, i, i);
            // 偶数长度情况
            int len2 = expandAroundCenter(chars, i, i+1);
            if(len1 > len2){
                if(len1>length) {
                    begin = i - len1 / 2;
                    length = len1;
                }
            }else{
                if(len2>length){
                    begin = i - len2 / 2 + 1;
                    length = len2;
                }
            }
        }
        return s.substring(begin, begin+length);
    }

    public int expandAroundCenter(char[] chars, int l, int r){
        while(l>=0 && r<chars.length && chars[l]==chars[r]){
            --l;
            ++r;
        }
        return r-l-1;
    }
}