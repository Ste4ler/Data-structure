public class Clearithbit{
    public static int clearbit(int n,int i){
        int bitmask = ~(1<<i);

        return n & bitmask;
    }
    public static void main(String[] args) {
        int num=10;
        int place=1;
        System.out.println(clearbit(num,place));
    }
}