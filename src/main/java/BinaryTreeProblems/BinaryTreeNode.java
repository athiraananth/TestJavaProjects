package BinaryTreeProblems;

public class BinaryTreeNode {
	
	public int Value;
	public BinaryTreeNode left;
	public BinaryTreeNode right;
	
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
	
	public int getValue() {
		return Value;
	}
	
	public BinaryTreeNode getLeft() {
		return left;
	}
	
	public BinaryTreeNode getRight() {
		return right;
	}
	
}
