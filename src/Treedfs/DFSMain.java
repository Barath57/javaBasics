package Treedfs;

public class DFSMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DFSNode root = new DFSNode(11);
		root.left = new DFSNode(2);
		root.right = new DFSNode(8);
		root.left.left = new DFSNode(6);
		root.left.right = new DFSNode(21);
		root.left.left.left = new DFSNode(4);
		root.left.left.right = new DFSNode(7);
		root.left.right.right = new DFSNode(8);
		root.right.left = new DFSNode(3);
		root.right.right = new DFSNode(7);
		root.right.left.right = new DFSNode(14);
		root.right.right.left = new DFSNode(29);
		root.right.right.left.right = new DFSNode(16);
		
		DFSLogic dfsLogic = new DFSLogic();
		System.out.println("*PRE-ORDER");
		dfsLogic.preOrder(root);
		System.out.println();
		System.out.println("*IN-ORDER*");
		dfsLogic.inOrder(root);
		System.out.println();
		System.out.println("*POST-ORDER*");
		dfsLogic.postOrder(root);


	}

}