package easy;

class LC009PalindromeNumber {
    public boolean isPalindrome(int x) {
        int a=x,b=0;
        int c=intMath.log10(Math.abs(x)) + 1;
        for(int i=0;i<=c;i++){
            b=b*10+a%10;
            a/=10;
        }
        if
        (x==b)return true;
        else
            return false;
    }
}