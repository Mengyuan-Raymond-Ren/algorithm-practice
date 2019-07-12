/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder first = new StringBuilder("");
        StringBuilder second = new StringBuilder("");
        
        int i = 0;
        while(l1 != null) {
            first.append(l1.val);
            l1 = l1.next;
            i++;
        }
        int j = 0;
        while(l2 != null) {
            second.append(l2.val);
            l2 = l2.next;
            j++;
        }
        
        int[] result = new int[Math.max(first.length(), second.length())+1];
        int k = 0;
        while(k < Math.min(first.length(), second.length())) {
            result[k] = first.charAt(k) + second.charAt(k) - 96;
            k++;
        }
        
        while(k < first.length()) {
            result[k] = first.charAt(k) - 48;
            k++;
        }
        while(k < second.length()) {
            result[k] = second.charAt(k) - 48;
            k++;
        }
        for(int x = 0; x<result.length; x++) {
            if(result[x] > 9) {
                result[x] = result[x] - 10;
                result[x+1]++;
            }
        }
        
        int y = 0;
        ListNode root = new ListNode(result[y]);
        ListNode pointer = root;
        ListNode element;
        y++;
        while(y < result.length - 1) {
            element = new ListNode(result[y]);
            pointer.next = element;
            pointer = pointer.next;
            y++;
        }
        if(result[result.length - 1] != 0) {
            element = new ListNode(result[result.length - 1]);
            pointer.next = element;
            pointer = pointer.next;
        }
        return root;
            
    }
}
