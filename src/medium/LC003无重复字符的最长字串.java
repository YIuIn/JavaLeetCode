package medium;

public class LC003无重复字符的最长字串 {
    /*class Solution {
        public int lengthOfLongestSubstring(String s) {
            int[] index = new int[128]; // 记录每个字符最后一次出现的位置 +1
            int maxLen = 0;
            int left = 0;

            for (int right = 0; right < s.length(); right++) {
                char ch = s.charAt(right);
                left = Math.max(left, index[ch]);
                maxLen = Math.max(maxLen, right - left + 1);
                index[ch] = right + 1;
            }

            return maxLen;
        }

    }*/
}
