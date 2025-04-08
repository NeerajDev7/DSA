public class StockBuyAndSell {
    public static void main(String[] args) {
        int[] arr = {1,5,3,8,12};
        System.out.println(stockBuyAndSell(arr));
    }
    public static int stockBuyAndSell(int[] arr) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i] < minPrice)
            {
                minPrice = arr[i];
            }
            int profit = arr[i] - minPrice;
            if(profit>maxProfit)
            {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }

}
