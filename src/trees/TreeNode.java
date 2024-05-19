package trees;

public class TreeNode <T>{
    T data;
    TreeNode<T> left, right;

    public TreeNode(T value){
        data = value;
        left = null;
        right = null;
    }
}
