package Array;

public class Main {
    public static   void main(String[] args) {
        
        MyArray array = new MyArray(10);

        array.insertInOrder(5);
        array.insertInOrder(10);
        array.insertInOrder(2);

        array.print();

    }
}


