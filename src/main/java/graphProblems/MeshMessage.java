package graphProblems;

import java.util.HashMap;
import java.util.Map;

public class MeshMessage {
	
	public Map<String, String[]> findDeliveryRoute(Map<String, String[]> network,String sender, String receiver){
		
		Map<String, String[]> routes= new HashMap<String,String[]>();
		String[] sNeighbors = {""}, rNeighbors= {""},mRouters= {""};
		
		for(Map.Entry<String, String[]> user: network.entrySet()) {
			
			if(user.getKey().equalsIgnoreCase(sender)) {
				sNeighbors=user.getValue();
			}
			else if(user.getKey().equalsIgnoreCase(sender)) {
				rNeighbors=user.getValue();
			}	
		}
		while(sNeighbors != null && rNeighbors !=null) {
			for(int i=0;i<sNeighbors.length;i++) {
				
				if(sNeighbors[i] == rNeighbors[i]) {
					mRouters[i]=sNeighbors[i];
				}
				else {
					
					findDeliveryRoute(network,sNeighbors[i],receiver);
				}
			}
			
		}
		
		return routes;
		
	}

}
