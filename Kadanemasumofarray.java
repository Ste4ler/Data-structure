public class Kadanemasumofarray{
    public static int Maxsum(int arr[]){
        int Currentsum=0;
        int maxsum = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            Currentsum+=arr[i];
            if(Currentsum < 0){
                Currentsum=0;
            }
            maxsum = Math.max(maxsum, Currentsum);
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        System.out.println("Maximum sum is: "+ (Maxsum(arr)));
    }
}