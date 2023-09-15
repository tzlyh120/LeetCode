import java.util.HashMap;
import java.util.Map;

/**
 * @author Yihan
 * @date 9/15/2023 - 2:42 PM
 */
public class TwoNum1 {
    public int[] twoSum(int[] nums, int target) {
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]+nums[j]==target){
        //             return new int[]{i,j};
        //         }
        //     }
        // }
        // return null;
        Map<Integer,Integer> numMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement = target-nums[i];
            if(numMap.containsKey(complement)){
                return new int[]{numMap.get(complement),i};
            }
            numMap.put(nums[i],i);
        }
        return new int[]{};
    }
}
