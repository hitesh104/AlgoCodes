package linklist.cll;

public class CircularMain {
    public static void main(String[] args) {
        CircularLinkList circularLinkList = new CircularLinkList();
        circularLinkList.insertAtTail(1);
        circularLinkList.insertAtTail(2);
        circularLinkList.insertAtTail(3);
        circularLinkList.insertAtTail(4);

        circularLinkList.traverse();
        System.out.println("Length : " + circularLinkList.length());
    }
}
