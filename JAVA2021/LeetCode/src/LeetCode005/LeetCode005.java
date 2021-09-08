package LeetCode005;

/**
 * 最长回文子串 动态规划
 */
class Solution1 {
    public String longestPalindrome(String s) {
        int n = s.length();
        if (n < 2) {
            return s;
        }
        int maxLength = 1;
        int begin = 0;
        // 保存s(i, j)是否为回文
        boolean[][] isManacher = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            isManacher[i][i] = true;
        }

        // 子串长度
        for (int L = 2; L <= n; L++) {
            // 左边界
            for (int i = 0; i < n - L + 1; i++) {
                // 右边界
                int j = i + L - 1;
                isManacher[i][j] = s.charAt(i) == s.charAt(j) && (L<=3 || isManacher[i + 1][j - 1]);
                if(isManacher[i][j]){
                    maxLength = Math.max(maxLength, L);
                    begin = i;
                }
            }
        }

        return s.substring(begin, begin + maxLength);
    }
}


/**
 * 中心扩展法
 */
class Solution2 {
    public String longestPalindrome(String s) {
        int begin = 0, maxLength = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            // 奇数长度情况
            int len1 = expandAroundCenter(chars, i, i);
            // 偶数长度情况
            int len2 = expandAroundCenter(chars, i, i + 1);
            int len = Math.max(len1, len2);
            if(len>maxLength){
                begin = i - len/2 + (len&1^1);
                maxLength = len;
            }
        }
        return s.substring(begin, begin + maxLength);
    }

    public int expandAroundCenter(char[] chars, int l, int r) {
        while (l >= 0 && r < chars.length && chars[l] == chars[r]) {
            --l;
            ++r;
        }
        return r - l - 1;
    }

    public static void main(String[] args) {
        new Solution2().longestPalindrome("babad");
    }
}