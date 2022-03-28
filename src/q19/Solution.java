package q19;

import util.ListNode;

/**
 * Created on 2022/3/28 by plixiaofei
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;

        // 快指针先走
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        // 剩下的一起走，当快指针走完时，满指针刚好走到倒数 n
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        // 慢指针跳过倒数第 n 个元素
        slow.next = slow.next.next;
        return dummy.next;
    }
}
