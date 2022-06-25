package linklist.dll;

public class DLLMain {
    public static void main(String[] args) {
        DoublyLinkList doublyLinkList = new DoublyLinkList();
        doublyLinkList.insertAtTail(1);
        doublyLinkList.insertAtTail(2);
        doublyLinkList.insertAtTail(3);
        doublyLinkList.insertAtTail(4);
        doublyLinkList.insertAtTail(5);

        doublyLinkList.insertAtPosition(2, 55);

        doublyLinkList.traverseForward();
        //doublyLinkList.traverseBackward();
    }
}
