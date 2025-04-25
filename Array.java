public class Array{
    public static void update(int marks[], int change){
        change =99;
        for(int i=0; i<marks.length; i++){
            marks[i]=marks[i] + 1;
        }
    }

    public static void main(String[] args){
        int marks[]={99,98,97};
        int changevalue=5; //----> yeh value change nahi hogi kyuki yeh bas function main change ho sakti hai due to call by value .
        update(marks,changevalue);

        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]+ " "); // ----> aur yeh isiliye change hui kyuki array humesa as call by reference se hi function main call hota hai .
        }
        System.out.println(changevalue); 

    }
}