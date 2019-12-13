package BinaryTreeProblems;

public class BinarySearchTreeChecker extends BinaryTreeNode {

	
	public BinarySearchTreeChecker(int value) {
		super(value);
		// TODO Auto-generated constructor stub
	}

	public boolean isBinarySearchTree(BinaryTreeNode root) {

		boolean flag=false;
		if(root == null) {
			throw new IllegalArgumentException(" Root node cannot be Null ");
		}
		else {
			while(root !=null && (root.left !=null || root.right !=null)) {
				int value=root.getValue();
				
				if(value > root.left.getValue()) {
					flag=true;
					root=root.left;
				}
				else if(value<root.right.getValue()) {
					flag=true;
					root=root.right;
				}
				else
					flag=false;
			}
		}

		return flag;

	}

}
