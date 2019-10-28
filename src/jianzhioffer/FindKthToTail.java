package jianzhioffer;

/**
 * @author chenlijun
 * @date 2019-10-27 18:22
 * <p>
 * 链表中倒数K个节点
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
public class FindKthToTail {
    public ListNode FindKthToTail(ListNode head, int k) {
        if (head == null) return null;
        ListNode result = head;
        int length = 1;
        while (head.next != null) {
            length++;
            head = head.next;
        }
        int index = length - k;
        if (index < 0) {
            return null;
        }
        while (index > 0) {
            result = result.next;
            index--;
        }
        return result;

    }
}
