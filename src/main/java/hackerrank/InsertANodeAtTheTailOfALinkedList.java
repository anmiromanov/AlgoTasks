package hackerrank;

public class InsertANodeAtTheTailOfALinkedList {
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data){
        SinglyLinkedListNode tmp = head;
        if (tmp == null){
            head = new SinglyLinkedListNode(data);
            return head;
        }
        while (tmp.next != null){
            tmp = tmp.next;
        }
        tmp.next = new SinglyLinkedListNode(data);
        return head;
    }
}
