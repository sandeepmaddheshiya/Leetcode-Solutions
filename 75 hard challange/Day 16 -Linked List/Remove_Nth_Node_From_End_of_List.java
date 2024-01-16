

public class Remove_Nth_Node_From_End_of_List {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return head;
        ListNode s=head,f=head;
        for(int i=0;i<n;i++) f=f.next;
        if(f==null) return head.next;
        while(f.next!=null){
            f=f.next;
            s=s.next;
        }
        s.next=s.next.next;
        return head;
        
    }
}
