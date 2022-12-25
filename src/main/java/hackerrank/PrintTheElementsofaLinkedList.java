package hackerrank;

import java.util.ArrayList;
import java.util.List;

/*
* https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list/problem?isFullScreen=true
* */
public class PrintTheElementsofaLinkedList {
    class SinglyLinkedListNode{
        int data;
        SinglyLinkedListNode next;
    }

    static void printLinkedList(SinglyLinkedListNode head){
        SinglyLinkedListNode currentNode = head;
        while (currentNode != null){
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }
}
