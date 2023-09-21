package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Yihan
 * @date 9/17/2023 - 12:35 AM
 */
public class ThreeSum15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int len = nums.length;
        for(int i=0;i<len-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1;
            int k=len-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum ==0){
                    result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    while(j+1<k && nums[j]==nums[j+1]){
                        j++;
                    }
                    while(k-1>j && nums[k]==nums[k-1]){
                        k--;
                    }
                    j++;
                    k--;
                }else if(sum<0){
                    j++;
                }else{
                    k--;
                }
            }
        }
        return result;
    }
}
