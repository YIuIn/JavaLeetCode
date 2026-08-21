package medium;

public class LC046全排列 {
  /*  class Solution {
        List<List<Integer>> p=new ArrayList<>();
        public List<List<Integer>> permute(int[] nums) {
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                list.add(nums[i]);
            }
            List<Integer> num=new ArrayList<>();
            dfs(list,num);
            return p;
        }
        public void dfs(List<Integer> list,List num){
            if(list.isEmpty()){
                p.add(new ArrayList<>(num));
                return;
            }
            for(int i=0;i<list.size();i++){
                num.add(list.get(i));
                Integer removed=list.remove(i);
                dfs(list,num);
                num.remove(num.size() - 1);
                list.add(i,removed);
            }
        }
    }*/
}
