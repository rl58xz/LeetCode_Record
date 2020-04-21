import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class maxSubArray_53 {
    public int maxSubArray(int[] nums) {
        int MAX = nums[0];
        int sum = nums[0];
        for(int i = 1; i < nums.length; i++ ){
            int tmp = sum + nums[i];
            sum = nums[i] > tmp ? nums[i] : tmp;
            MAX = MAX > sum ? MAX : sum;
        }
        return MAX;
    }

    public static void main(String[] args) {
        int [] arr = new int[] {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(new maxSubArray_53().maxSubArray(arr));
    }
}
