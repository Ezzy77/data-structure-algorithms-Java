package linkedlist;

public class LinkedList <T> {
    Node<T> head;

    public void addFirst(T data){

        Node<T> newNode = new Node<>(data);

        newNode.next = head;

        head = newNode;

    }

    public void addAfter(T data, Node<T> prevNode){
        if (prevNode == null) return;

        Node<T> newNode = new Node<>(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    public void addLast(T data){
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node<T> currentNode = head;
        while (currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;

    }

    public int getLength(){
        int length = 0;
        Node<T> currentNode = head;
        while (currentNode != null){
            length ++;
            currentNode = currentNode.next;
        }
        return  length;
    }

    public void deleteNode(T data){
        Node<T> currentNode = head;
        Node<T> prevNode = null;

        if (currentNode != null && currentNode.data == data){
            head = currentNode.next;
            return;
        }
        while (currentNode != null && currentNode.data != data){
            prevNode = currentNode;
            currentNode = currentNode.next;
        }

        if (currentNode == null) return;
        prevNode.next = currentNode.next;

    }

    public void reverse(){
        Node<T> prevNode = null;
        Node<T> currentNode = head;
        Node<T> nextNode = null;

        while (currentNode != null){
            nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        head = prevNode;
    }


    public void printList() {
        Node<T> currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }
}
