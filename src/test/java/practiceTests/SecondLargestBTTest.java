package practiceTests;

import org.testng.annotations.Test;

import BinaryTreeProblems.BinaryTreeNode;
import BinaryTreeProblems.SecondLargestBT;

public class SecondLargestBTTest {
	
	@Test(enabled=true)
	public void secondLargestBT_Test1() {
		SecondLargestBT slbt=new SecondLargestBT();
		BinaryTreeNode bt=new BinaryTreeNode(35);
		BinaryTreeNode lft=bt.insertLeft(20);
		lft.insertLeft(15);
		lft.insertRight(25);
		System.out.println(slbt.findSecondLargest(bt).getValue());
	}
	
	@Test(enabled=false)
	public void secondLargestBT_Test2() {
		SecondLargestBT slbt=new SecondLargestBT();
		BinaryTreeNode bt=new BinaryTreeNode(35);
		bt.insertRight(55);
		BinaryTreeNode lft=bt.insertLeft(20);
		lft.insertLeft(15);
		lft.insertRight(25);
		System.out.println(slbt.findSecondLargest(bt).getValue());
	}
	
	@Test(enabled=false)
	public void secondLargestBT_Test3() {
		SecondLargestBT slbt=new SecondLargestBT();
		BinaryTreeNode bt=new BinaryTreeNode(35);
		BinaryTreeNode lft=bt.insertLeft(20);
		lft.insertLeft(15);
		lft.insertRight(25);
		BinaryTreeNode rgt=bt.insertRight(55);
		rgt.insertLeft(40);
		BinaryTreeNode rgt1=rgt.insertRight(60);
		rgt1.insertLeft(58);
		rgt1.insertRight(65);
		System.out.println(slbt.findSecondLargest(bt).getValue());
	}
	
	@Test(enabled=false)
	public void secondLargestBT_Test4() {
		SecondLargestBT slbt=new SecondLargestBT();
		BinaryTreeNode bt=new BinaryTreeNode(35);
		BinaryTreeNode lft=bt.insertLeft(20);
		lft.insertLeft(15);
		BinaryTreeNode lft1=lft.insertRight(25);
		lft1.insertRight(28);
		lft1.insertLeft(22);
		System.out.println(slbt.findSecondLargest(bt).getValue());
	}

}
