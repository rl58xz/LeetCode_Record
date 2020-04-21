import java.util.HashMap;
import java.util.Map;

public class MajorityElement_169 {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> a = new HashMap<>();
        for (int tmp : nums){
            if (a.containsKey(Integer.valueOf(tmp))){
                int s = a.get(Integer.valueOf(tmp)).intValue();
                a.put(Integer.valueOf(tmp),Integer.valueOf(s+1));
            }else {
                a.put(Integer.valueOf(tmp), Integer.valueOf(1));
            }
        }
        for (Map.Entry<Integer,Integer> entry : a.entrySet()){
            if(entry.getValue().intValue() >= ((int)nums.length/2)+1) return entry.getKey().intValue();
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array1 = {3,2,3};
        System.out.println(new MajorityElement_169().majorityElement(array1));
    }
}
