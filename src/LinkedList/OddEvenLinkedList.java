package LinkedList;

public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode oddHead = head;
        ListNode evenHead = head.next;
        ListNode oddTail = oddHead;
        ListNode evenTail = evenHead;

        ListNode curr = evenHead.next;
        int index = 3;

        while (curr != null) {
            if (index % 2 == 1) {
                oddTail.next = curr;
                oddTail = curr;
            } else {
                evenTail.next = curr;
                evenTail = curr;
            }
            curr = curr.next;
            index++;
        }

        oddTail.next = evenHead;
        evenTail.next = null;

        return oddHead;
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);

        OddEvenLinkedList oddEvenLinkedList = new OddEvenLinkedList();
        ListNode result1 = oddEvenLinkedList.oddEvenList(head1);
        printLinkedList(result1);

        ListNode head2 = new ListNode(2);
        head2.next = new ListNode(1);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(5);
        head2.next.next.next.next = new ListNode(6);
        head2.next.next.next.next.next = new ListNode(4);
        head2.next.next.next.next.next.next = new ListNode(7);

        ListNode result2 = oddEvenLinkedList.oddEvenList(head2);
        printLinkedList(result2);
    }

    public static void printLinkedList(ListNode head) {
        ListNode curr = head;

        while (curr != null) {
            System.out.print(curr.val);

            if (curr.next != null) {
                System.out.print(" -> ");
            }

            curr = curr.next;
        }
        System.out.println();
    }
}
