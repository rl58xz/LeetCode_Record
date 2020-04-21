import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class coinChange_322 {
    public int coinChange(int[] coins, int amount) {
        if (amount == 0) return 0;
        int Max = amount + 1;
        for(int i = 0; i < coins.length; i++){
            if(amount < coins[i]) continue;
            int tmp = coinChange(coins,amount - coins[i]);
            if(tmp == -1) continue;
            Max = Max > tmp+1 ? tmp+1 : Max;
        }
        if(Max == amount + 1) return -1;
        return Max;
    }

    public int coinChange1(int[] coins, int amount) {
        int [] res= new int[amount+1];
        for(int i = 0; i < amount+1; i++){
            int min = amount + 1;
            for(int j = 0; j < coins.length; j++){
                if(i - coins[j] < 0) continue;
                else if(i - coins[j] == 0){
                    min = 1;
                    continue;
                }
                if(res[i - coins[j]] < 1) continue;
                min = min < res[i-coins[j]] + 1 ? min : res[i-coins[j]] + 1;
            }
            if(min == amount + 1) res[i] = -1;
            else res[i] = min;
        }
        res[0] = 0;
        return res[amount];
    }

    public static void main(String[] args) {
        int [] arr = new int [] {2};
        System.out.println(new coinChange_322().coinChange1(arr,3));
    }
}
