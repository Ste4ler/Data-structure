public class Stockmarket{
    public static int stock_price(int arr[]){
        int maxprofit=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
               int profit = arr[j]-arr[i];
               if(profit>maxprofit){
                maxprofit=profit;
                }
            }
        }
        return maxprofit>0 ? maxprofit : 0;
    }
    public static void main(String[] args) {
        int stock[]= {7,1,5,3,6,4};
        System.out.println("Maximum Profit after buying the stocks: " + stock_price(stock));
    }
}