package BinaryTreeProblems;

import java.util.ArrayList;
import java.util.Stack;

public class BalancedBinaryTree {
	
	BinaryTreeNode Node;
	Integer Depth;
	
	public BinaryTreeNode getNode() {
		return Node;
	}


	public int getDepth() {
		return Depth;
	}
	
	public BalancedBinaryTree(BinaryTreeNode node,int depth ) {
		Node=node;
		Depth=depth;
	}
	

	public boolean isBalancedBT(BinaryTreeNode treeNode) {
		
		if(treeNode == null) {
			return true;
		}
		
		ArrayList<Integer>depths =new ArrayList<Integer>(3);
		Stack nodes=new Stack<BalancedBinaryTree>();
		nodes.push(new BalancedBinaryTree(treeNode,0));
	
		while(nodes.size()>0) {
			BalancedBinaryTree nodePair=(BalancedBinaryTree)nodes.pop();
			BinaryTreeNode node=nodePair.Node;
			Integer depth=nodePair.Depth;
			
			if(node.left == null && node.right == null) {
				
				if(!(depths.contains(depth))) {
					depths.add(depth);
					
					if(depths.size()>=2 && Math.abs(depths.get(0)-depths.get(1))>1) {
						return false;
					}
				}
			}
			else {
				
				if(node.left !=null) {
					nodes.push(new BalancedBinaryTree(node.left, depth+1));
				}
				if(node.right !=null) {
					nodes.push(new BalancedBinaryTree(node.right,depth+1));
				}
			}
		}
		return true;
		
	}
	
}
