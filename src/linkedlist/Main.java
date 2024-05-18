package linkedlist;

public class Main {

    public static void main(String[] args){

        LinkedList<Integer> myList = new LinkedList<Integer>();

        myList.addFirst(10);
        myList.addFirst(1);
        myList.addFirst(3);
        myList.addFirst(5);

        myList.addAfter(6, myList.head.next);
        myList.addLast(9);

        myList.printList();
        System.out.println("Length of list is: " + myList.getLength());
        myList.deleteNode(9);
        myList.printList();
        System.out.println("Length of list is: " + myList.getLength());
    }
}
