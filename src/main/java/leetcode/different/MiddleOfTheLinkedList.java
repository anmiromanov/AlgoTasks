package leetcode.different;

import java.util.ArrayList;
import java.util.List;

/*
* 876. Middle of the Linked List
* https://leetcode.com/problems/middle-of-the-linked-list/
* */
public class MiddleOfTheLinkedList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode middleNode(ListNode head){
        if (head.next == null){
            return head;
        }
        ListNode result = head;
        List<ListNode> list = new ArrayList<>();
        while (head != null){
            list.add(head);
            head = head.next;
        }

        int middleIndex = list.size() / 2;

        result = list.get(middleIndex);

        return result;
    }
}
