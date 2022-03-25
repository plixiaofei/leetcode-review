package q2;

import util.ListNode;

/**
 * Created on 2022/3/25 by plixiaofei
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0, null);
        ListNode temp = head;
        int remain = 0;
        while (l1 != null || l2 != null) {
            int sum = remain;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2. val;
                l2 = l2.next;
            }
            remain = sum / 10;
            temp.next = new ListNode(sum % 10, null);
            temp = temp.next;
        }
        // 最后一位进位
        if (remain > 0) {
            temp.next = new ListNode(remain, null);
        }
        return head.next;
    }
}
