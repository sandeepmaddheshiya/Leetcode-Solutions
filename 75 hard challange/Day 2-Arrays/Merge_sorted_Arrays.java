import java.util.Arrays;

public class Merge_sorted_Arrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        for(int i=0;i<nums1.length-m;i++){
            nums1[m+i]=nums2[i];
        }
        Arrays.sort(nums1);
    }
}
