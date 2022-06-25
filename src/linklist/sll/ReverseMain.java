package linklist.sll;

public class ReverseMain {
    public static void main(String[] args) {
        SinglyLinkList singlyLinkList = new SinglyLinkList();
        singlyLinkList.createList(5);
        singlyLinkList.traverse();

        singlyLinkList.reverse();
        singlyLinkList.traverse();
    }
}
