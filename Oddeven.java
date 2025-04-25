public class Oddeven {
    public static void oddoreven(int n){
        
        if((n & 1)==0){
            System.out.println("Number is Even!");
        }
        else{
            System.out.println("Number is Odd!");
        }

    }
    public static void main(String[] args) {
        oddoreven(9);
        oddoreven(11);
        oddoreven(34);
    }
}