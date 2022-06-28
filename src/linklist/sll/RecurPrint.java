package linklist.sll;

public class RecurPrint {
    public static void main(String[] args) {
        SinglyLinkList singlyLinkList = new SinglyLinkList();
        singlyLinkList.insertAtTail(1);
        singlyLinkList.insertAtTail(2);
        singlyLinkList.insertAtTail(3);

        print(singlyLinkList.getHead());
        //System.out.print("null");
    }

    static void print(Node cur) {
        if (cur == null)
            return;
        print(cur.next);
        System.out.print(cur.val + " ");
    }
}
