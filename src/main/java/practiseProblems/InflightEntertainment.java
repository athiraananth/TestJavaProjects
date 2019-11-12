package practiseProblems;

import java.util.HashSet;

public class InflightEntertainment {
	
	public static boolean flightEntertaintment(int flightlen, int movieLength[]) {
		HashSet<Integer> movieSet= new HashSet<Integer>();
		int secondMovieLength;
		for(int i=0;i<movieLength.length;i++) {
			movieSet.add(movieLength[i]);
		}
		for(Integer mLen : movieSet) {
			secondMovieLength=flightlen-mLen;
			
			if(movieSet.contains(secondMovieLength)) {
				return true;
			}
		}
		
		return false;
	}

}
