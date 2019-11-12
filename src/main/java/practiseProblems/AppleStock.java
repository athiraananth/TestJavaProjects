package practiseProblems;

public class AppleStock {
	
	public static int getMaxProfit(int[] stockPrices) {
		
		if(stockPrices.length<2) {
			throw new IllegalArgumentException(" Minimum two prices required to find Profit!! ");
		}
		int minPrice=stockPrices[0];
		int maxProfit=stockPrices[1]-stockPrices[0];
			for(int i=1;i<stockPrices.length;i++) {
				int currentPrice=stockPrices[i];
				int potentialProfit=currentPrice-minPrice;
				maxProfit=Math.max(maxProfit, potentialProfit);
				minPrice=Math.min(minPrice, currentPrice);
			}
		return maxProfit;
	}

}