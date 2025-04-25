public class Pallindrome {
    public static void pallindrome(String str){
        int mid = str.length()/2;
        int match=0;
        for(int i=0; i<mid; i++){
            if(str.charAt(i)==str.charAt(str.length()-i-1)){
                match++;
            }
        }
        
        if(match==mid){
            System.out.print("Pallindrome!");
        }
        else{
            System.out.print("Not Pallindrome!");
        }
    }
    public static void main(String[] args) {
        String word = "madam";
        pallindrome(word);
    }
}