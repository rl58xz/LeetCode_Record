import java.util.List;

public class mergeKLists_23 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode merge (ListNode a, ListNode b){
        if(a == null) return b;
        if(b == null) return a;
        ListNode head = null;
        if(a.val < b.val){
            head = a;
            a.next = merge(a.next,b);
        }else {
            head = b;
            b.next = merge(b.next,a);
        }
        return head;
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 1) return lists[0];
        for(int i = 0; i < lists.length - 1; i++){
            lists[i+1] = merge(lists[i],lists[i+1]);
        }
        return lists[lists.length - 1];
    }

    public ListNode mergeKLists2(ListNode[] lists) {
        if(lists.length == 1) return lists[0];
        for(int i = 0; i < lists.length - 1; i++){
            lists[i+1] = merge(lists[i],lists[i+1]);
        }
        return lists[lists.length - 1];
    }

    public static void main(String[] args) {

    }
}
