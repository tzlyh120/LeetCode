package RedMall;

/**
 * @author Yihan
 * @date 9/18/2023 - 11:12 PM
 */
public class LeftSum2 {
    public static void main(String[] args) {
        System.out.println(leftSum2(new int[]{1,3,4,2,5}));
    }

    public static int leftSum2(int[] nums){
       return mergeSort(nums,0,nums.length-1);
    }

    public static int mergeSort(int[] nums,int l,int r){
        if(l==r) return 0;
        int m = (l+r)>>1;
        return mergeSort(nums,l,m)+mergeSort(nums,m+1,r)+merge(nums,l,m,r);
    }

    public static int merge(int[] nums, int l,int m,int r){
        int p1 = l;
        int p2 = m+1;
        int index = 0;
        int sum =0;
        int[] temp = new int[r-l+1];
        while(p1<=m && p2<=r){
            sum+= nums[p1]<nums[p2]?(r-p2+1)*nums[p1]:0;
            temp[index++]=nums[p1]<nums[p2]?nums[p1++]:nums[p2++];
        }
        while(p1<=m) temp[index++]=nums[p1++];
        while(p2<=r) temp[index++]=nums[p2++];
        for(int i=0;i<temp.length;i++) nums[l++]=temp[i];
        return sum;

    }
}
