package medium;

public class LC078子集 {
/*    class Solution {
        List<List<Integer>> p = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        public List<List<Integer>> subsets(int[] nums) {
            dfs(nums, 0);
            return p;
        }
        private void dfs(int[] nums, int start) {
            p.add(new ArrayList<>(path));
            for (int i = start; i < nums.length; i++) {
                path.add(nums[i]);
                dfs(nums, i + 1);
                path.remove(path.size() - 1);
            }
        }
    }*/
}
