package linklist.sll;

public class MiddleMain {
    public static void main(String[] args) {
        SinglyLinkList singlyLinkList = new SinglyLinkList();
        singlyLinkList.createList(5);

        singlyLinkList.traverse();
        singlyLinkList.printMiddle();

        singlyLinkList.deleteMiddle();
        singlyLinkList.traverse();
    }
}
