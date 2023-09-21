package array;

/**
 * @author Yihan
 * @date 9/16/2023 - 11:47 PM
 */
public class RemoveElement27 {
    public int removeElement(int[] nums, int val) {
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(val!=nums[i]){
                nums[index++]=nums[i];
            }
        }
        return index;
    }
}
