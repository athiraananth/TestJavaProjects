package practiceTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import graphProblems.GraphColoring;
import graphProblems.GraphNode;

public class GraphColorTests {
	
	@Test
	public void colorGraphNode_Test1() {
		
		GraphNode a=new GraphNode("a");
		GraphNode b=new GraphNode("b");
		GraphNode c=new GraphNode("c");
		b.setColor("Blue");
		c.setColor("Yellow");
		a.addNeighbors(b);
		a.addNeighbors(c);
		b.addNeighbors(a);
		b.addNeighbors(c);
		c.addNeighbors(b);
		c.addNeighbors(a);
		
		GraphColoring gc=new GraphColoring();
		Assert.assertTrue(gc.colorTheGraph(a, "Red"));
	}
	
	@Test
	public void colorGraphNode_Test2() {
		
		GraphNode a=new GraphNode("a");
		GraphNode b=new GraphNode("b");
		GraphNode c=new GraphNode("c");
		GraphNode d=new GraphNode("d");
		b.setColor("Blue");
		c.setColor("Yellow");
		d.setColor("Red");
		a.addNeighbors(b);
		a.addNeighbors(c);
		a.addNeighbors(d);
		b.addNeighbors(a);
		b.addNeighbors(c);
		c.addNeighbors(b);
		c.addNeighbors(a);
		
		GraphColoring gc=new GraphColoring();
		Assert.assertFalse(gc.colorTheGraph(a, "Red"));
	}

}
