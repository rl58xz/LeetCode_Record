import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.ConcurrentLinkedDeque;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
 }


public class levelOrder_102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Deque<TreeNode> deque = new ConcurrentLinkedDeque<TreeNode>();
        Deque<TreeNode> childdeque = new ConcurrentLinkedDeque<TreeNode>();
        List<Integer>  tmp= new ArrayList<>();
        deque.add(root);
        while (!deque.isEmpty()){
            TreeNode t = deque.remove();
            tmp.add(t.val);
            if(t.left != null) childdeque.add(t.left);
            if(t.right != null) childdeque.add(t.right);
            if(deque.isEmpty()){
                deque.addAll(childdeque);
                childdeque.clear();
                res.add(tmp);
                tmp = new ArrayList<>();
            }
        }
        return res;
    }
}
