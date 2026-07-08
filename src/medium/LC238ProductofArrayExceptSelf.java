package medium;

public class LC238ProductofArrayExceptSelf {
    int length=nums.length;
    int[] left =new int[length];
    int[] right =new int[length];
    int[] answer=new int[length];
    left[0]=1;
        for(int i=1;i<length;i++){
        left[i]=nums[i-1]*left[i-1];
    }
    right[length-1]=1;
        for(int i=length-2;i>=0;i--){
        right[i]=nums[i+1]*right[i+1];
    }
        for(int i=0;i<length;i++){
        answer[i]=left[i]*right[i];
    }
        return answer;
}
