import java.util.*;
public class Trappingrainwater {
    public static int trap_water(int arr[]){
        int n= arr.length;
        int trapped_water =0;
        int left_max[]= new int [n];
        left_max[0]=arr[0];
        for(int i=1; i<n; i++){
            left_max[i]=Math.max(arr[i],left_max[i-1]);
        }

        int right_max[]= new int [n];
        right_max[n-1]=arr[n-1];
        for(int i=n-2; i>=0; i--){
            right_max[i]=Math.max(arr[i],right_max[i+1]);
        }

        for(int i=0; i<n; i++){
            int waterlevel=Math.min(left_max[i],right_max[i]);
            trapped_water += waterlevel - arr[i];
        }
        return trapped_water;
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        System.out.println(trap_water(height));
    }
}