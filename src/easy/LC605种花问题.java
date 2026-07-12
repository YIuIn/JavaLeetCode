package easy;

public class LC605种花问题 {
/*    class Solution {
        public boolean canPlaceFlowers(int[] flowerbed, int n) {
            int zeroCount = 1; // 逻辑左哨兵
            int ans = 0;
            for (int num : flowerbed) {
                if (num == 0) {
                    zeroCount++;
                    continue; // 0 的情况在这里直接结束，跳到下一个数
                }
                // 1 的情况直接“掉落”到这里，不需要写 else
                ans += (zeroCount - 1) / 2;
                zeroCount = 0;
                if (ans >= n) return true;
            }
            zeroCount++; // 逻辑右哨兵
            ans += (zeroCount - 1) / 2;

            return ans >= n;
        }
    }*/
}
