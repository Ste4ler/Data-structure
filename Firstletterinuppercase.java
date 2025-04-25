public class Firstletterinuppercase {
    public static String uppercase(String str){
        StringBuilder sb = new StringBuilder(" ");
        char ch = Character.toUpperCase(sb.charAt(0));
        sb.append(ch);

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String sent= "this is a beautiful day";
        System.out.print(uppercase(sent));
    }
}