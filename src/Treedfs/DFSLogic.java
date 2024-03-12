package Treedfs;

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



}
    
