package linklist.sll;

public class DetectLoopMain {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = third;

        SinglyLinkList singlyLinkList = new SinglyLinkList();
        singlyLinkList.setHead(head);

        //singlyLinkList.traverse();
        System.out.println("Loop ? " + singlyLinkList.detectLoop());
    }


}
