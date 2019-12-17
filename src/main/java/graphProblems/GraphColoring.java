package graphProblems;

import java.util.Set;

public class GraphColoring {

	public boolean colorTheGraph(GraphNode node, String colour) {
		boolean cStatus=true;
		Set<GraphNode> neighbour=node.getNeighbors();
		for(GraphNode nbr:neighbour) {
			
			if(nbr.hasColor() && colour.equalsIgnoreCase(nbr.getColor())) {
				cStatus=false;
			}
		}
		if(cStatus == true) {
			node.setColor(colour);
		}
		return cStatus;
	}
}
