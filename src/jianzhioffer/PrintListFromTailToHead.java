package jianzhioffer;

import java.util.ArrayList;

/**
 * @author chenlijun
 * @date 2019-10-26 12:11
 * <p>
 * 从尾到头打印链表
 * 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 */
public class PrintListFromTailToHead {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        while (listNode != null) {
            result.add(0, listNode.val);
            listNode = listNode.next;
        }
        return result;
    }
}

