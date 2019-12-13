package practiceTests;

import org.testng.annotations.Test;

import BinaryTreeProblems.BinarySearchTreeChecker;
import BinaryTreeProblems.BinaryTreeNode;

public class BinaryTreeCheckerTest {

	@Test
	public static void isBinaryTree_Test1() {
		BinaryTreeNode btn=new BinaryTreeNode(35);
		btn.setLeft(new BinaryTreeNode(25));
		BinaryTreeNode right1=new BinaryTreeNode(55);
		btn.setRight(right1);
		right1.setLeft(new BinaryTreeNode(40));
		right1.setRight(new BinaryTreeNode(60));
		BinarySearchTreeChecker bstc=new BinarySearchTreeChecker(20);
		BinaryTreeNode left1=new BinaryTreeNode(15);
		bstc.setLeft(left1);
		left1.setLeft(new BinaryTreeNode(10));
		left1.setRight(new BinaryTreeNode(30));
		btn.setRight(new BinaryTreeNode(45));
		System.out.println(bstc.isBinarySearchTree(btn));
		System.out.println(bstc.isBinarySearchTree(bstc));
	}
}
