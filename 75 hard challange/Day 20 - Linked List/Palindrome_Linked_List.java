public class Palindrome_Linked_List {
    public boolean isPalindrome(ListNode head) {
        Deque<Integer> stack=new ArrayDeque<Integer>();
        for(ListNode curr=head;curr!=null;curr=curr.next){
            stack.push(curr.val);
        }
        for(ListNode curr=head;curr!=null;curr=curr.next){
            if(curr.val!=stack.pop()){
                return false;
            }
        }
        return true;
    }
}
