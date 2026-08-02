package Dsa;
//best time to buy and sell a stock


public class Stock {
    public int maxProfit(int[] prices){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices){
            if (price < minPrice){
                minPrice = price;
            }else if (price - minPrice > maxProfit){
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }


    public static void main(String[] args) {

        Stock bss = new Stock();
        System.out.println(bss.maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println(bss.maxProfit(new int[]{7,6,4,3,1}));

    }
}
