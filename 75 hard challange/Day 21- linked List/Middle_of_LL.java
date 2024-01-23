

public class Middle_of_LL {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            slow=slow.next;
            fast =fast.next.next;
        }
        return slow;
    }Keep Multiplying Found Values by Two
}
