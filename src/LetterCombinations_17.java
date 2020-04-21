import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LetterCombinations_17 {
    public List<String> letterCombinations(String digits) {
        String [] dic = new String[] {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        if(digits.length() == 0) return  new ArrayList<String >();
        return letter(dic,digits);
    }
    public List<String> letter(String[] dic, String digits){
        List<String> resstr = new ArrayList<>();
        int s = (Integer.valueOf(digits).intValue())%10;
        digits = digits.substring(0,digits.length()-1);
        String newstr = dic[s];
        if(digits.length() <= 0){
            for(int i = 0; i < newstr.length(); i++){
                resstr.add(""+newstr.charAt(i));
            }
        }else {
            List<String> newstr2 = letter(dic,digits);
            for (String dealstr : newstr2){
                for(int i = 0; i < newstr.length(); i++){
                    resstr.add(dealstr+newstr.charAt(i));
                }
            }
        }
        return resstr;
    }

    public static void main(String[] args) {
        System.out.println(new LetterCombinations_17().letterCombinations("234"));
    }
}
