package array;

import java.util.Arrays;

/**
 * @author Yihan
 * @date 9/15/2023 - 3:30 PM
 */
public class RemoveDuplicates26 {
    public static void main(String[] args) {
        int[] nums= {1,1,4};
        removeDuplicates(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static int removeDuplicates(int[] nums) {
        int index=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[index++]=nums[i];
            }
        }
        return index;
    }
}
