public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int res = findSum(10);

        System.out.println(res);

    }


    public static int findSum(int n){

        return n * (n +1) / 2;
    }
}