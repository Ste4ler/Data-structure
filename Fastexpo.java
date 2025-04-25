public class Fastexpo{
    public static void fastexponent(int a , int n){
        int ans=1;
        while(n>0){
            if((n & 1) !=0){
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        fastexponent(5,1000000);
    }
}