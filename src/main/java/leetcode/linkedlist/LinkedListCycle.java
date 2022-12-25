package leetcode.linkedlist;
/*
* https://leetcode.com/explore/learn/card/linked-list/214/two-pointer-technique/1212/
* */
public class LinkedListCycle {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head){
        boolean hasCycle = false;
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != null && fast != null){
            slow = slow.next;
            fast = fast.next;
            if (slow == fast){
                hasCycle = true;
                return hasCycle;
            }
        }
        return hasCycle;
    }
}
