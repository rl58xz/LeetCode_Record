public class maxProduct_152 {
    public int maxProduct(int[] nums) {
        int res = Integer.MIN_VALUE;
        int max = 1;
        int min = 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0){
                int tmp = min;
                min = max;
                max = tmp;
            }
            max = max * nums[i] > nums[i] ? max * nums[i] : nums[i];
            min = min * nums[i] < nums[i] ? min * nums[i] : nums[i];

            res = res > max ? res : max;
        }
        return res;
    }

    public static void main(String[] args) {
        int [] arr = new int [] {-2,-1,4};
        System.out.println(new maxProduct_152().maxProduct(arr));
    }
}
