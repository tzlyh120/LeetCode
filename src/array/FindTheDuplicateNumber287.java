package array;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Yihan
 * @date 9/17/2023 - 1:15 AM
 */
public class FindTheDuplicateNumber287 {
    public static void main(String[] args) {
        int[] nums = {1,3,2,4,3};
        int i = findDuplicate_fastSlow(nums);
        System.out.println(i);
    }
    public static int findDuplicate_fastSlow(int[] nums) {
        int slow = 0;
        int fast = 0;
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        slow = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }

    public int findDuplicate2(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!set.add(nums[i])){
                return nums[i];
            }
        }
        return -1;
    }
}
