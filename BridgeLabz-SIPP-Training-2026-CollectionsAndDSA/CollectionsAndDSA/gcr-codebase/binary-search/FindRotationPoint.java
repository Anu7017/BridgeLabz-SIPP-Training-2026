import java.util.*;

public class FindRotationPoint {
    public static void main(String[] args) {
        int[] nums={4,5,6,7,0,1,2};
        int l=0,r=nums.length-1;
        while(l<r){
            int m=l+(r-l)/2;
            if(nums[m]>nums[r]) l=m+1;
            else r=m;
        }
        System.out.println("Rotation Index = "+l);
        System.out.println("Minimum Element = "+nums[l]);
    }
}
