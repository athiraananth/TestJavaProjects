package practiceTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import BinaryTreeProblems.BalancedBinaryTree;
import BinaryTreeProblems.BinaryTreeNode;

public class BalancedBinaryTreeTests {
	
	//20,15,25,10,18,30,
	@Test
	public void balancedBTTests_1() {
		BinaryTreeNode btn=new BinaryTreeNode(20);
		BinaryTreeNode left1=btn.insertLeft(15);
		BinaryTreeNode right1=btn.insertRight(25);
		left1.insertRight(18);
		left1.insertLeft(10);
		right1.insertRight(30);
		BalancedBinaryTree bbt=new BalancedBinaryTree(btn,2);
		Assert.assertTrue(bbt.isBalancedBT(btn));
		
	}

	
	//50,25,60,20,30,10
		@Test
		public void balancedBTTests_2() {
			BinaryTreeNode btn=new BinaryTreeNode(50);
			BinaryTreeNode left1=btn.insertLeft(25);
			//BinaryTreeNode right1=btn.insertRight(60);
			left1.insertRight(30);
			left1.insertLeft(20);
			BinaryTreeNode left2=left1.insertLeft(10);
			BalancedBinaryTree bbt=new BalancedBinaryTree(btn,0);
			Assert.assertFalse(bbt.isBalancedBT(btn));
			
		}
}
