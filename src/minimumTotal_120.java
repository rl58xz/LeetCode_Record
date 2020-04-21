import java.util.ArrayList;
import java.util.List;

public class minimumTotal_120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        int min = triangle.get(0).get(0);
        for(int i = 1; i < triangle.size(); i++){
            triangle.get(i).set(0,triangle.get(i).get(0)+triangle.get(i-1).get(0));
            min = triangle.get(i).get(0);
            for(int j = 1; j < triangle.get(i).size()-1; j++){
                int tmp = triangle.get(i-1).get(j-1) > triangle.get(i-1).get(j) ? triangle.get(i-1).get(j) + triangle.get(i).get(j) : triangle.get(i-1).get(j-1) + triangle.get(i).get(j);
                triangle.get(i).set(j,tmp);
                min = min > tmp ? tmp : min;
            }
            triangle.get(i).set(triangle.get(i).size()-1,triangle.get(i).get(triangle.get(i).size()-1)+triangle.get(i-1).get(triangle.get(i-1).size()-1));
            min = min > triangle.get(i).get(triangle.get(i).size()-1) ? triangle.get(i).get(triangle.get(i).size()-1) : min;
        }
        return min;
    }

    public static void main(String[] args) {
        minimumTotal_120 mt = new minimumTotal_120();
        List<Integer> arr1 = new ArrayList<>();
        arr1.add(Integer.valueOf(1));
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(arr1);
        arr1.add(Integer.valueOf(3));
        arr.add(arr1);
        System.out.println(mt.minimumTotal(arr));
    }
}
