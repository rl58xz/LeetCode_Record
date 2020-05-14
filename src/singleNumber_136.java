import java.util.Arrays;

public class singleNumber_136 {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int tmp : nums){
            res ^= tmp;
        }
        return res;
    }
}
