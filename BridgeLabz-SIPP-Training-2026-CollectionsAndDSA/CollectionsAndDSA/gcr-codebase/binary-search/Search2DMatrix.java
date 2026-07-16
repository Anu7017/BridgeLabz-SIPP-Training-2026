import java.util.*;

public class Search2DMatrix {
    public static void main(String[] args) {
        int[][] matrix={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=3;
        int rows=matrix.length, cols=matrix[0].length;
        int l=0,r=rows*cols-1;
        boolean found=false;
        while(l<=r){
            int m=l+(r-l)/2;
            int val=matrix[m/cols][m%cols];
            if(val==target){found=true;break;}
            if(val<target) l=m+1;
            else r=m-1;
        }
        System.out.println(found);
    }
}
