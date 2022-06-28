package linklist.sll;

public class ExtractNumber {
    public static void main(String[] args) {
        SinglyLinkList singlyLinkList1 = new SinglyLinkList();
        singlyLinkList1.insertAtTail(2);
        singlyLinkList1.insertAtTail(5);

        int number1 = getNumber(singlyLinkList1.getHead());
        System.out.println(number1);

        SinglyLinkList singlyLinkList2 = new SinglyLinkList();
        singlyLinkList2.insertAtTail(1);
        singlyLinkList2.insertAtTail(0);
        singlyLinkList2.insertAtTail(0);
        int number2 = getNumber(singlyLinkList2.getHead());
        System.out.println(number2);

        System.out.println(" number 1 * number 2 = " + (number1 * number2));
    }

    static int getNumber(Node head) {
        if (null == head)
            return 0;

        int prev = 0;
        Node cur = head;
        while (cur != null) {
            prev = cur.val + 10 * prev;
            cur = cur.next;
        }

        return prev;
    }
}
