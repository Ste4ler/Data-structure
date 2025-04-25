public class Binarysearch {
    public static void search(int arr[],int key){
        int mid = arr.length/2;
        if(key<arr[mid]){
            for(int i=0; i<mid; i++){
                if(key==arr[i]){
                    System.out.println("Element is found at index " + i);
                }
            }
        }
        else if(key>arr[mid]){
            for(int i=mid+1; i<arr.length; i++){
                if(key==arr[i]){
                    System.out.println("Element is found at index " + i);
                }
            }
        }
        else{
            System.out.println("Element not found in this array!!");
        }

    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12,14};
        int item = 12;
        search(arr,item);

    }
}