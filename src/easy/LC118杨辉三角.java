package easy;

public class LC118杨辉三角 {
/*    class Solution {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> ret=new ArrayList<>();
            for(int i=0;i<numRows;i++){
                List<Integer> list=new ArrayList<>();
                for(int j=0;j<=i;j++){
                    if(j==0||j==i){
                        list.add(1);
                    }else{
                        list.add(ret.get(i-1).get(j-1)+ret.get(i-1).get(j));
                    }
                }
                ret.add(list);
            }
            return ret;
        }
    }*/
}
