package BinaryTreeProblems;

public class SecondLargestBT {


	public BinaryTreeNode findSecondLargest(BinaryTreeNode node) {

		BinaryTreeNode secLargest = null;
		
		if(node == null) {
			throw new IllegalArgumentException(" Invalid input!!");
		}

		else if(node.right ==null && node.left == null) {
			
			secLargest =node;
		}
		else if(node.right == null && node.left != null){
				BinaryTreeNode left1=node.left;
				if(left1.right ==null) {
					secLargest=left1;
				}
				else {
					BinaryTreeNode lRight1=left1.right;
					findSecondLargest(lRight1);
				}
		}
		else {
				BinaryTreeNode rRight1=node.right;
				if(rRight1.right ==null && rRight1.left == null) {
					secLargest=node;
				}
				else {
					findSecondLargest(rRight1);
				}
		
		}
		return secLargest;
						
		}

	}
