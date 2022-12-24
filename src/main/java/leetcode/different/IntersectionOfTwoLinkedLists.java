package leetcode.different;
/*
160. Intersection of Two Linked Lists
https://leetcode.com/problems/intersection-of-two-linked-lists/
*/
public class IntersectionOfTwoLinkedLists {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode aPoint = headA;
        ListNode bPoint = headB;

        while (aPoint != bPoint){
            if (aPoint == null){
                aPoint = headB;
            } else {
                aPoint = aPoint.next;
            }

            if (bPoint == null){
                bPoint = headA;
            } else {
                bPoint = bPoint.next;
            }
        }
        return aPoint;
    }
}
