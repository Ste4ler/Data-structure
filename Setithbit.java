public class Setithbit{
    public static int setbit(int n,int i){
        int bitmask=1<<i;

        return n | bitmask;
    }
    public static void main(String[] args) {
        int num=7;
        int place=2;
        System.out.println(setbit(num,place));
    }
}