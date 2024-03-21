package Treedfs.BinarySearchTree;


    public class BSTreelogic {
        BSTreeNode root;
    
        public BSTreeNode insert(int value) {
            if (root == null) {
                root = new BSTreeNode(value);
                return root;
            } else {
                return insert(root, value);
            }
        }
    
        private BSTreeNode insert(BSTreeNode currentRoot, int value) {
            if (currentRoot == null) {
                BSTreeNode newNode = new BSTreeNode(value);
                return newNode;
            }
    
            if (value <= currentRoot.value) {
                System.out.println("parent: " + currentRoot.value + " left: " + value);
                currentRoot.left = insert(currentRoot.left, value);
            } else if (value > currentRoot.value) {
                System.out.println("parent: " + currentRoot.value + " right: " + value);
                currentRoot.right = insert(currentRoot.right, value);
            }
            return currentRoot;
        }


        public boolean find(int value) {
            if (find(root, value) == null ) {
                System.out.println("false for value: " + value);
                return false;
            } else {
                System.out.println("true for value: " + value);
                return true;
            }
        }
    
        private BSTreeNode find(BSTreeNode currentNode, int value) {
    
            if (currentNode == null) {
                return null;
            }
    
            if (currentNode.value == value) {
                return currentNode;
            } else if (currentNode.value > value) {
                return  find(currentNode.left, value);
            } else {
               return find(currentNode.right, value);
            }
        }
      
}
