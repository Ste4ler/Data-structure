public class Largestnuminarray {
    public static void largest(int arr[],int large){
        for(int i =0; i<arr.length; i++){
            if(large<arr[i]){
                large=arr[i];
            }
        }
        System.out.println("The largest value in the array is: " + large);
    }
    public static void main(String[] args){
        int arr[]={10,9,8,2,882,3,292};
        int large = Integer.MIN_VALUE;
        largest(arr,large);
    }
}
