package array;

import java.util.ArrayList;
import java.util.List;

public class StockBuyAndSell {

    public static void main(String[] args) {

        int arr[] = {63, 17 ,59 ,6 ,8 ,7, 52, 50, 20};
        int i = stockBuySell(arr);
        System.out.println(i);
    }

    static int stockBuySell(int arr[]) {
        List<Integer> list = new ArrayList<>();
        int maxProfit = 0;
        int maxProfit1 = 0;
        int res = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            maxProfit = 0;
            for (int j = i; j < arr.length; j++) {
                int profit = arr[j] - arr[i];
                if (arr[j] < arr[i]) {
                    break;
                }

                if (maxProfit < profit) {
                    maxProfit += profit;
                }
            }
            if(maxProfit1 < maxProfit)
            {
                res+=maxProfit;
                maxProfit1 = maxProfit;
            }
        }
        return res;
    }

}
