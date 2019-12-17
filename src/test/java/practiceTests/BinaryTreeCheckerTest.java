package practiceTests;

import org.testng.annotations.Test;

import BinaryTreeProblems.BinarySearchTreeChecker;
import BinaryTreeProblems.BinaryTreeNode;

public class BinaryTreeCheckerTest {

	@Test
	public static void isBinaryTree_Test1() {
		BinaryTreeNode btn=new BinaryTreeNode(35);
		BinaryTreeNode left1=btn.insertLeft(25);
		left1.insertLeft(10);
		left1.insertRight(20);
		BinaryTreeNode right1=btn.insertRight(55);
		right1.insertLeft(40);
		BinarySearchTreeChecker bstc=new BinarySearchTreeChecker(20);
		BinaryTreeNode btn1=new BinaryTreeNode(15);
		BinaryTreeNode left2=btn1.insertLeft(45);
		left2.insertRight(100);
		BinaryTreeNode right2=btn1.insertRight(10);
		System.out.println(bstc.isBinarySearchTree(btn));
		System.out.println(bstc.isBinarySearchTree(bstc));
	}
}
