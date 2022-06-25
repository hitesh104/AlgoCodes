package linklist.sll;

public class MergeSortedList {
    public static void main(String[] args) {
        SinglyLinkList list1 = new SinglyLinkList();
        list1.insertAtTail(9);
        list1.insertAtTail(15);
        list1.insertAtTail(20);
        list1.insertAtTail(30);
        list1.insertAtTail(35);
        list1.traverse();

        SinglyLinkList list2 = new SinglyLinkList();
        list2.insertAtTail(5);
        list2.insertAtTail(8);
        list2.insertAtTail(25);
        list2.insertAtTail(40);
        list2.insertAtTail(50);
        list2.insertAtTail(60);
        list2.traverse();

        Node sortedList = merge(list1.getHead(), list2.getHead());
        SLLUtil.traverse(sortedList);
    }

    static Node merge(Node list1, Node list2) {
        if (null == list1)
            return list2;

        if (null == list2)
            return list1;

        Node res = new Node(-1);
        Node resCur = res;

        Node cur1 = list1, cur2 = list2;
        while (cur1 != null && cur2 != null) {
            if (cur1.val <= cur2.val) {
                resCur.next = cur1;
                cur1 = cur1.next;
            } else {
                resCur.next = cur2;
                cur2 = cur2.next;
            }
            resCur = resCur.next;
        }

        if (cur1 == null) {
            resCur.next = cur2;
        } else {
            resCur.next = cur1;
        }

        return res.next;
    }
}
