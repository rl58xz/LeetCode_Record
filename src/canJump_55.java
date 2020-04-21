public class canJump_55 {
    public boolean canJump(int[] nums) {
        int max = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(max >= nums.length - 1) return true;
            if(max < i) return false;
            max = max > (i + nums[i]) ? max : (i + nums[i]);
        }
        return true;
    }
}
