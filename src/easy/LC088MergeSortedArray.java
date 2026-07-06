package easy;

public class LC088MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=n-1;
        int j=m-1;
        int k=nums1.length-1;
        while(i>=0){
            if(j<0){
                nums1[k]=nums2[i];
                k--;
                i--;
                continue;
            }
            if(nums1[j]<nums2[i]){
                nums1[k]=nums2[i];
                k--;
                i--;
            }
            else{
                nums1[k]=nums1[j];
                j--;
                k--;
            }
        }
    }
}
