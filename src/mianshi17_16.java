public class mianshi17_16 {
    public int massage(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length < 2) return nums[0];
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = nums[1];
        for(int i = 2; i < nums.length;i++){
            int tmp = dp[i-2];
            if(i - 3 >= 0) tmp = dp[i-2] > dp[i-3] ? dp[i-2] : dp[i-3];
            dp[i] = tmp + nums[i];
        }
        return dp[nums.length-1]>dp[nums.length-2]?dp[nums.length-1]:dp[nums.length-2];
    }
    public static void main(String[] args) {
        mianshi17_16 mian = new mianshi17_16();
        System.out.println(mian.massage(new int[]{1,2,3,1}));
    }
}
