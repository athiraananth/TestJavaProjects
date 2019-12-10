package BinaryTreeProblems;

public class BinaryTreeNode {
	
	public int Value;
	public BinaryTreeNode left;
	public BinaryTreeNode right;
	
	public int getValue() {
		return Value;
	}
	public void setValue(int value) {
		this.Value = value;
	}
	public BinaryTreeNode getLeft() {
		return left;
	}
	public void setLeft(BinaryTreeNode left) {
		this.left = left;
	}
	public BinaryTreeNode getRight() {
		return right;
	}
	public void setRight(BinaryTreeNode right) {
		this.right = right;
	}
	

	public BinaryTreeNode(int value) {
		Value=value;
	}
	
	public BinaryTreeNode insertLeft(int leftValue) {
		left=new BinaryTreeNode(leftValue);
		return left;
	}
	
	public BinaryTreeNode insertRight(int rightValue) {
		right=new BinaryTreeNode(rightValue);
		return right;
	}
}
