import java.util.*;

public class SearchRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;

        int l=0,r=nums.length-1,ans=-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(nums[m]==target){ans=m;break;}
            if(nums[l]<=nums[m]){
                if(target>=nums[l]&&target<nums[m]) r=m-1;
                else l=m+1;
            }else{
                if(target>nums[m]&&target<=nums[r]) l=m+1;
                else r=m-1;
            }
        }
        System.out.println(ans);
    }
}
