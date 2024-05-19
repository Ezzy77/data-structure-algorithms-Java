package trees;

import java.util.Stack;

public class BinaryTree<T> {
    TreeNode<T> root;

    BinaryTree(){
        root = null;
    }

    public void depthFirstSearch(TreeNode<T> isRoot) {
        root = isRoot;
        Stack<TreeNode<T>> tStack = new Stack<>();
        tStack.push(root);

        while (!tStack.isEmpty()) {
            TreeNode<T> current = tStack.pop();

            if (current.data != null) System.out.println(current.data);

            if (current.right != null) tStack.push(current.right);
            if (current.left != null) tStack.push(current.left);
        }
    }
}
