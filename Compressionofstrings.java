public class Compressionofstrings{
    public static void main(String[] args) {
        String str= "aaabbbbcccc";
        StringBuilder sb = new StringBuilder("");

        for(int i=0; i<str.length(); i++){
            char ch =str.charAt(i);
            int count = 1;
            for(int j=i+1; j<str.length(); j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
                else{
                    break;
                }
            }
            sb.append(ch).append(count);
            i+=count-1;
        }
        System.out.print(sb.toString());
    }
}