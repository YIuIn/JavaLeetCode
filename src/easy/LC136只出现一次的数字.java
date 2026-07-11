package easy;

public class LC136只出现一次的数字 {
    int single=0;
        for(int num:nums){
        single ^=num;
    }
        return single;
}
