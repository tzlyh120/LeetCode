package RedMall;

/**
 * @author Yihan
 * @date 9/18/2023 - 9:53 PM
 */
public class LeftSum {
    public static void main(String[] args) {
        System.out.println(leftSum(new int[]{1,3,4,2,5}));
    }
    public static int leftSum(int[] arr){
        if(arr==null || arr.length==0) throw new RuntimeException("error data");
        return mergeSort(arr,0,arr.length-1);
    }
    private static int mergeSort(int[] arr,int l,int r){
        if(l==r) return 0;
        int mid = (l+r)>>1;
        return mergeSort(arr,l,mid)+ mergeSort(arr,mid+1,r)+ merge(arr,l,mid,r);
    }
    private static int merge(int[] arr,int l,int m,int r){
        int p1=l;
        int p2=m+1;
        int index = 0;
        int[] help = new int[r-l+1];
        int sum=0;
        while(p1<=m && p2<=r){
            sum += arr[p1]<arr[p2]?(r-p2+1)*arr[p1]:0;
            help[index++]=arr[p1]<arr[p2]?arr[p1++]:arr[p2++];
        }
        while(p1<=m) help[index++]=arr[p1++];
        while(p2<=r) help[index++]=arr[p2++];
        for(int i=0; i<help.length;i++) arr[l++]=help[i];
        return sum;
    }
}
