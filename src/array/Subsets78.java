package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Yihan
 * @date 9/18/2023 - 12:02 AM
 */
public class Subsets78 {
    static List<Integer> t = new ArrayList<Integer>();
    static List<List<Integer>> result = new ArrayList<List<Integer>>();
    static int n;

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
//        List<List<Integer>> lists = subsets(nums);
//        List<Integer> t = new ArrayList<Integer>();
        result = subsets(nums);
        for (List<Integer> list : result) {
            System.out.println(list.toString());
        }
    }

//    public static List<List<Integer>> subsets(int[] nums) {
//        int n = nums.length;
//        for (int mask = 0; mask < (1 << n); ++mask) {
//            System.out.println(1<<n);
//            t.clear();
//            for (int i = 0; i < n; ++i) {
//                if ((mask & (1 << i)) != 0) {
//                    t.add(nums[i]);
//                }
//            }
//            ans.add(new ArrayList<Integer>(t));
//        }
//        return ans;
//    }


//    public static List<List<Integer>> subsets(int[] nums) {
//        dfs(0, nums);
//        return ans;
//    }
//
//    public static void dfs(int cur, int[] nums) {
//        if (cur == nums.length) {
//            ans.add(new ArrayList<Integer>(t));
//            return;
//        }
//        t.add(nums[cur]);
//        dfs(cur + 1, nums);
//        t.remove(t.size() - 1);
//        dfs(cur + 1, nums);
//    }


    //    public static List<List<Integer>> subsets2(int[] nums) {
//        List<List<Integer>> list = new ArrayList<>();
//        list.add(Arrays.asList());
//        for(int num:nums){
//            int size = list.size();
//            System.out.println("size==="+size);
//            for(int j=0;j<size;j++){
//                List<Integer> temp = new ArrayList<>(list.get(j));
//                temp.add(num);
//                System.out.println(temp.toString());
//                list.add(temp);
//            }
//        }
//
//        return list;
//    }


//    public static List<List<Integer>> subsets3(int[] nums) {
//        List<List<Integer>> list = new ArrayList<>();
//        Arrays.sort(nums);
//        backtrack(list, new ArrayList<>(), nums, 0);
//        return list;
//    }
//
//    private static void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int start) {
//        list.add(new ArrayList<>(tempList));
//        System.out.println(tempList.toString());
//        for (int i = start; i < nums.length; i++) {
//            tempList.add(nums[i]);
//            backtrack(list, tempList, nums, i + 1);
//            tempList.remove(tempList.size() - 1);
//            System.out.println(tempList.toString());
//        }
//    }

//    public static List<List<Integer>> subsets(int[] nums) {
//        for(int k=0;k<=nums.length;k++){
//            backtrack(0, k,new ArrayList<Integer>(),nums);
//        }
//        return result;
//    }
//
//    private static void backtrack(int start,int k, ArrayList<Integer> tempList,int[] nums) {
//        if(k==0){
//            result.add(new ArrayList<>(tempList));
//            System.out.println(tempList.toString());
//            return;
//        }
//        for (int i = start; i < nums.length; i++) {
//            tempList.add(nums[i]);
//            backtrack(i+1,k-1,tempList,nums);
//            tempList.remove(tempList.size() - 1);
//            System.out.println(tempList.toString());
//        }
//    }

//    List<List<Integer>> result = new ArrayList<>();
    public static List<List<Integer>> subsets(int[] nums) {
        for(int k=0;k<=nums.length;k++){
            backtrack(0,k,new ArrayList<Integer>(),nums);
        }
        return result;
    }
    public static void backtrack(int start,int k,ArrayList<Integer> cur,int[] nums){
        if(k==0){
            result.add(new ArrayList<>(cur));
            return;
        }
        for(int i=start;i<nums.length;i++){
            cur.add(nums[i]);
            backtrack(i+1,k-1,cur,nums);
            cur.remove(cur.size()-1);
            System.out.println(cur.toString());
        }
    }
}

