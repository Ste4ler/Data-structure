public class Powerornot {
    public static void checkpoweroftwo(int n){
        if((n & n-1)==0){
            System.out.println("Numer is power is 2");
        }
        else{
            System.out.println("Number is not power of 2");
        }
    }
    public static void main(String[] args) {
        checkpoweroftwo(32);
    }
}