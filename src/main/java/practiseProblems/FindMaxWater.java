package practiseProblems;

public class FindMaxWater {
	
	public int findMaxArea(int height[]) {
		
		int maxArea=0;
		int l=0, r=height.length-1;
		
		while(l<r) {
			maxArea=Math.max(maxArea, Math.min(height[l],height[r])*(r-l));
			
			if(height[l]<height[r]) {
				l++;
			}
			else {
				r--;
			}
		}
		
		return maxArea;
	}

}
