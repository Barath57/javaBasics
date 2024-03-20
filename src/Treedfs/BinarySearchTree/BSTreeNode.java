package Treedfs.BinarySearchTree;

public class BSTreeNode {  
	int value;
	BSTreeNode left;
	BSTreeNode right;
	public BSTreeNode(int value){
		this.value=value;
	}
    public BSTreeNode getLeft(){
        return left;
    }
    public BSTreeNode getRight(){
        return right;
    }
    public int getValue(){
        return value;
    }
    public void setLeft(BSTreeNode left){
        this.left = left;
    }
    public void setRight(BSTreeNode right){
        this.right = right;
    }
    public void setValue(int value){
        this.value = value;
    }
}



