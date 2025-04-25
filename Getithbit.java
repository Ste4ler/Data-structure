public class Getithbit{
    public static int ithplace(int n,int i){
        int bitmask = i<<1;
        
        if((n & bitmask)==0){
            return 0;
        }
        else{
            return 1;
        }

    }
    public static void main(String[] args) {
        int num=10;
        int place=3;
        System.out.println(ithplace(num,place));
    }
}