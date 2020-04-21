import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class LemonadeChange_860 {
    public boolean lemonadeChange(int[] bills) {
        int m = 0, n = 0;
        for (int i = 0; i < bills.length; i++){
            switch (bills[i]){
                case 20:
                {
                    if (n > 0){
                        if(m > 0){
                            n--;m--;
                        }
                        else return false;
                    }else if (m > 3){
                        m=m-3;
                    }else {
                        return false;
                    }
                    break;
                }
                case 10:
                {
                    if (m > 0){
                        m--;n++;
                    }else {
                        return false;
                    }
                    break;
                }
                case 5:
                {
                    m++;
                    break;
                }
                default:break;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        LemonadeChange_860 lc = new LemonadeChange_860();
        int[] s = {5,5,10,10,20};
        boolean res = lc.lemonadeChange(s);
        System.out.println(res);
    }
}
