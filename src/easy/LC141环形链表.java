package easy;

public class LC141环形链表 {
    Set<ListNode> se=new HashSet<ListNode>();
        while(head!=null){
        if(se.contains(head))return true;
        se.add(head);
        head=head.next;
    }
        return false;
}
