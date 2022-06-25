package linklist.sll;

public class Main {
    public static void main(String[] args) {
        SinglyLinkList singlyLinkList = new SinglyLinkList();
        singlyLinkList.createList(5);
        singlyLinkList.traverse();
        System.out.println("Length : " + singlyLinkList.length());

        singlyLinkList.insertAtPosition(2, 55);
        singlyLinkList.traverse();

        singlyLinkList.insertAtPosition(0, 66);
        singlyLinkList.traverse();

        singlyLinkList.insertAtPosition(1100, 74);
        singlyLinkList.traverse();
    }
}
