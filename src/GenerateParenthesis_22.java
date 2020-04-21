import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenerateParenthesis_22 {
    public List<String> generateParenthesis(int n){
        List<String> res = new ArrayList<>();
        if ( n == 1 ){
            res.add("()");
            return res;
        }
        List tmp = generateParenthesis(n-1);
        Iterator it = tmp.listIterator();
        while (it.hasNext()){
            String tmpString = (String) it.next();
            if(!(tmpString+"()").equals("()"+tmpString)) res.add(tmpString+"()");
            res.add("()"+tmpString);
            res.add("("+tmpString+")");
        }
        return res;
    }
}
