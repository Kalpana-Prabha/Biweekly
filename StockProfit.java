public class StockProfit {
    public static int MaxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }
        return maxProfit;
    }
        public static void main(String[] args){
            int[] price1={7,1,5,3,6,4};
            System.out.println(MaxProfit(price1));
            int[] price2={7,6,4,3,1};
            System.out.println(MaxProfit(price2));
        }
    }

