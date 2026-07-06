package easy;

public class LC344ReverseString {
    public void reverseString(char[] s) {
        int left=0;
        int right=s.length-1;
        char a;
        while(left<right){
            a=s[left];
            s[left]=s[right];
            s[right]=a;
            left++;
            right--;
        }
    }
}
