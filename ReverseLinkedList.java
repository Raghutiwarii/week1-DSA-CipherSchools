package linkedlist;


public class ReverseLinkedList {


    public static Node reverseLL(Node head) {

        Node currentHead = head;
        Node restLLHead = null;
        Node recentHead = null;


        while (currentHead != null) {
            restLLHead = currentHead.next;
            currentHead.next = recentHead;
            recentHead = currentHead;
            currentHead = restLLHead;
        }

        head = recentHead;

        return head;
    }


    public static Node reverseRecursive(Node head) {

        Node restLLHead = reverseLL(head.next);

        head.next.next = restLLHead;

        head.next = null;

        return restLLHead;
    }
}
