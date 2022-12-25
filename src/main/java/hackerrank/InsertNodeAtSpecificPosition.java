package hackerrank;

public class InsertNodeAtSpecificPosition {
    public static SinglyLinkedListNode insertNodeApPosition(SinglyLinkedListNode llist, int data, int position){
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        SinglyLinkedListNode currentNode = llist;
        int count = 0;
        while (currentNode.next != null){
            if (count == position){
                currentNode.next = newNode;
                newNode.next = currentNode.next;
                break;
            }
            currentNode = currentNode.next;
            count++;
        }
        return llist;
    }
}
