public class Searchedinsortedmatrix {
    public static boolean Staircase(int matrix[][],int key){
        //From Top to bottom staircase
        int row=0;
        int col=matrix[0].length-1;
        
        while(row<=matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("Element is found at ("+ row + "," + col +")");
                return true;
            }
            else if(key<matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Element is not found!!");
        return false;
        // From Bottom to to staircase
       /* int top=matrix[0].length-1;
        int right=0;
        while(right<matrix.length && top>=0){
                if(matrix[right][top]==key){
                    System.out.println("Element is found at ("+ right + "," + top +")");
                    return true;
                }
                else if(key<matrix[right][top]){
                    top--;
                }
                else{
                    right++;
               }
            }
        System.out.println("Element is not found!!");
        return false;
   }*/
}
    public static void main(String[] args) {
        int matrix[][]={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};

        int key=35;
        Staircase(matrix,key);
    }
}