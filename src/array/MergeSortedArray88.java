package array;

import java.util.Arrays;

/**
 * @author Yihan
 * @date 9/17/2023 - 12:48 AM
 */
public class MergeSortedArray88 {
    public static void main(String[] args) {
        int[] nums1 = {2,0};
        int[] nums2 = {1};
        merge(nums1,1,nums2,1);
        System.out.println(Arrays.toString(nums1));
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m+n-1;
        int i = m-1;
        int j = n-1;
        while(j>=0){
            if(i>=0 && nums1[i]>nums2[j]){
                nums1[k--]=nums1[i--];
            }else{
                nums1[k--]=nums2[j--];
            }
        }
    }
}
