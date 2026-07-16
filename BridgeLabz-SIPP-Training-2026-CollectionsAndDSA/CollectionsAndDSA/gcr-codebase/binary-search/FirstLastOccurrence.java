import java.util.*;

public class FirstLastOccurrence {
    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,10};
        int target=8;
        int first=-1,last=-1;
        int l=0,r=nums.length-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(nums[m]>=target){
                if(nums[m]==target) first=m;
                r=m-1;
            }else l=m+1;
        }
        l=0; r=nums.length-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(nums[m]<=target){
                if(nums[m]==target) last=m;
                l=m+1;
            }else r=m-1;
        }
        System.out.println("First = "+first);
        System.out.println("Last = "+last);
    }
}
