// Last updated: 10/08/2026, 23:53:21
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNodes(ListNode head) {
        ListNode current=head;
        Deque<ListNode> Stack= new ArrayDeque<>();
        while(current != null){
            while((!Stack.isEmpty())&&(Stack.peek().val<current.val)){
                Stack.pop();
            }
            Stack.push(current);
            current=current.next;
        }       
        ListNode next = null;
        while(!Stack.isEmpty()){
            ListNode node = Stack.pop();
            node.next = next;
            next = node;

        }
        return next;
    }
}