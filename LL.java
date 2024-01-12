public class LL {
    public static void main(String[] args) {
        
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int c=0;
        ListNode head=null;
        ListNode tail=null;
        while ((l1!=null && l2!=null)) {

            int ans=c+l1.val+l2.val;
            if (head==null) {
                head =tail=new ListNode(ans%10);
                c=ans/10;
            }else{
                ListNode curr=new ListNode(ans%10);
                c=ans/10;
                tail.next=curr;
                tail=tail.next;
            }
            l1=l1.next;
            l2=l2.next;
        }
        while (l1!=null) {
            int ans=c+l1.val;
            if (head==null) {
                head =tail=new ListNode(ans%10);
                c=ans/10;
            }else{
            ListNode curr=new ListNode(ans%10);
                c=ans/10;
                tail.next=curr;
                tail=tail.next;
            }
                l1=l1.next;
        }
        while (l2!=null) {
            int ans=c+l2.val;
            if (head==null) {
                head =tail=new ListNode(ans%10);
                c=ans/10;
            }else{
            ListNode curr=new ListNode(ans%10);
                c=ans/10;
                tail.next=curr;
                tail=tail.next;
            }
                l2=l2.next;
        }
        while (c>0) {
            int ans=c;
            ListNode curr=new ListNode(ans%10);
                c=ans/10;
                tail.next=curr;
                tail=tail.next;
        }
        return head;
    }
}
