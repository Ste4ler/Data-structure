public class Charat {
    public static void printname(String name){
        for(int i=0; i<name.length();i++){
            System.out.print(name.charAt(i)+" ");
        }
    }
    public static void main(String[] args) {
        String name = "John";
        String surname = "Wick";
        String fullname = name + surname;
        printname(fullname);
    }
}