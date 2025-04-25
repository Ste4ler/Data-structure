import java.util.*;
public class Linearsearch {
    public static void Linear(int arr[],int item){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==item){
                System.out.println("Element found in array at index " + i );
            }
        }

    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12,13,14,16,18,20};
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Linear(arr,num);

    }
}