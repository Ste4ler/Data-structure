public class Daigonalsum{
    public static void main(String[] args) {
        int matrix[][] ={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        int n= matrix.length;
        int sum_of_rs = 0;
        int sum_of_ls = 0;
        for(int i=0; i<n; i++){
            sum_of_rs+=matrix[i][i];
        }
        for(int i=0; i<n; i++){
            sum_of_ls+=matrix[i][i];
        }
        int Calcsum=sum_of_ls+sum_of_rs;
        System.out.print("Diagonal sum is: " + sum_of_ls);
    }
}