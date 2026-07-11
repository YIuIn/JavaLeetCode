package easy.LC349;

public class 两个数组的交集 {

    Set<Integer> set1=new HashSet<Integer>();
    Set<Integer> set2=new HashSet<Integer>();
        for(int num:nums1)set1.add(num);
        for(int num:nums2)set2.add(num);
    Set<Integer> hashset=new HashSet<Integer>();
        for(int num:set1){
        if(set2.contains(num))hashset.add(num);
    }
    int []arr=new int[hashset.size()];
    int i=0;
        for(int num:hashset)arr[i++]=num;
        return arr;
}
