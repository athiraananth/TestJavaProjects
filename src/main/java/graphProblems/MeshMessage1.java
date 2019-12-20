package graphProblems;

import java.awt.List;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class MeshMessage1 {
	
	public static String[] findPath(HashMap<String, String> howWeReached, String startNode, String endNode) {
		
		LinkedList<String> shortestPath= new LinkedList();
		String currentNode=endNode;
		while(currentNode !=null) {
			shortestPath.add(currentNode);
			currentNode=howWeReached.get(currentNode);
		}
		Collections.reverse(shortestPath);
		return shortestPath.toArray(new String[0]);
		
	}

	public static String[] bfsGetPath(HashMap<String, String[]> graph,String sender, String receiver) {
		Queue<String> nodesToVisit=new LinkedList<String>();
		nodesToVisit.add(sender);
		HashMap howWeReachedNodes= new HashMap<String, String>();
		howWeReachedNodes.put(sender,null);
		while(nodesToVisit.size()>0) {
			String currentNode=nodesToVisit.remove();
			if(currentNode == receiver) {
				return findPath(howWeReachedNodes, sender, receiver);
			}
			
			for(String neighbor: graph.get(currentNode)) {
				
				if(!(nodesToVisit.contains(neighbor))) {
					nodesToVisit.add(neighbor);
					howWeReachedNodes.put(neighbor, currentNode);
					
				}
				
			}
		}
		
		return null;
		
	}
}
