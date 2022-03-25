package util;

/**
 * Created on 2022/3/25 by plixiaofei
 */
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    public static ListNode generateList(int[] nums) {
        ListNode head = new ListNode();
        ListNode dummy = head;
        for (int num: nums) {
            dummy.next = new ListNode(num);
            dummy = dummy.next;
        }
        dummy.next = null;
        return head.next;
    }

    public static void display(ListNode head) {
        if (head == null) {
            System.out.println("---");
        }
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

}
