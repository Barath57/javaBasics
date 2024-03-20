package Treedfs.BinarySearchTree;

public class BSTreelogic {
    private BSTreeNode root;

    public void setRoot(BSTreeNode root) {
        this.root = root;
    }

    public void insert(int value) {
        if (root != null) {
            if (root.value <= value) {
                root.left.value = value;
            } else {
                root.right.value = value;
            }
        }
    }
}
