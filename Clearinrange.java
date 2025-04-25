public class Clearinrange{
    public static void clearbitsinrange(int n, int i, int j){
        int bitmask=((~0<<j+1));
        int bitmask2=(1<<i-1);

        System.out.println(n & bitmask|bitmask2);
    }
    public static void main(String[] args) {
        clearbitsinrange(10, 2, 4);
    }
}