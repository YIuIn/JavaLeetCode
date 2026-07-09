package easy;

public class LC217存在重复元素 {
    Set set=new HashSet();
        for(int i=0;i<nums.length;i++){
        if(set.contains(nums[i]))return true;
        else set.add(nums[i]);
    }
        return false;
}
