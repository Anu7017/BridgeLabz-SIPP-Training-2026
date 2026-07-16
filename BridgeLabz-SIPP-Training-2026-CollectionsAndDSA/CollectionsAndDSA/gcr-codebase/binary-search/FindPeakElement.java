import java.util.*;

public class FindPeakElement {
    public static void main(String[] args) {
        int[] nums={1,2,3,1};
        int l=0,r=nums.length-1;
        while(l<r){
            int m=l+(r-l)/2;
            if(nums[m]>nums[m+1]) r=m;
            else l=m+1;
        }
        System.out.println("Peak Index = "+l);
        System.out.println("Peak Element = "+nums[l]);
    }
}
