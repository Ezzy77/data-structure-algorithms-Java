package Array;

public class MyArray {
    public int length;
    private int[] array;

    public MyArray(int size){
        array = new int[size];
        length = size;
    }

    public void insert(int value){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0){
                array[i] = value;
                return;
            }
        }
    }

    public void insertInOrder(int value){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0){
                array[i] = value;
                return;
            }
            if (array[i] <= value) continue;
        }
    }

    public void print(){
        for (int j : array) {
            System.out.println(j);
        }
    }

}
