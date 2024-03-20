package Treedfs;

import java.util.LinkedList;
import java.util.Queue;

public class DFSLogic {

	DFSNode root;
	
	public void setRoot(DFSNode root)
	{
		this.root=root;
	}
	
	public void preOrder(DFSNode child)
	{
	if(child != null)
	{
		System.out.print("  "+child.value);
		preOrder(child.left);
		preOrder(child.right);
	}
	}
	
	public void inOrder(DFSNode child)
	{
	if(child != null)
	{
		inOrder(child.left);
		System.out.print("  "+child.value);
		inOrder(child.right);
	}
	}
	
	public void postOrder(DFSNode child)
	{
	if(child != null)
	{
		postOrder(child.left);
		postOrder(child.right);
		System.out.print("  "+child.value);
	}
	}

	public DFSNode mirror(DFSNode root) {

		if (root == null) {
			return root;
		}

		DFSNode lH = mirror(root.left);
		DFSNode rH = mirror(root.right);

		if (lH != null || rH != null) {
			root.left = rH;
			root.right = lH;
		}

		return root;
	}


	public int height(DFSNode root, int i) {
		if (root == null) {
			return i - 1;
		}

		int lH = height(root.left, i+1);
		int rH = height(root.right, i+1);

		if (lH < rH) {
			return rH;
		} else {
			return lH;
		}
	}


	public void printBFD(DFSNode root) {
		Queue<DFSNode> queue = new LinkedList<DFSNode>();
		
		queue.offer(root);

		while (queue.size() != 0) {
			DFSNode current = queue.poll();
			System.out.print(" " + current.value);

			if (current.left != null) {
				queue.offer(current.left);
			}

			if (current.right != null) {
				queue.offer(current.right);
			}
		}
	}
}
    
