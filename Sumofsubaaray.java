public class Sumofsubaaray {
    public static int Maxsum(int arr[]){
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            int currentSum =0;
            for(int j=i; j<n ;j++){
                currentSum+=arr[j];
                maxSum=Math.max(maxSum, currentSum);
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        System.out.println("Max Sum is: " + (Maxsum(arr)));
    }
}