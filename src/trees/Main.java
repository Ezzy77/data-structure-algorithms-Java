package trees;


public class Main {

    public static void main(String[] args){

        BinaryTree<String> binaryTree = new BinaryTree<>();

        TreeNode<String> root = new TreeNode<>("a");

        root.left = new TreeNode<>("b");
        root.right = new TreeNode<>("c");
        root.left.left = new TreeNode<>("d");
        root.left.right = new TreeNode<>("e");
        root.right.right = new TreeNode<>("f");


        binaryTree.depthFirstSearch(root);


    }
}
