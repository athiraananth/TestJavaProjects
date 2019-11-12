package practiseProblems;

public class ReverseInteger {
	
	public static int reverseInt(int x) {
		long res=0;
		while(x!=0) {
			int pop=x%10;
			res=res*10+pop;
			x=x/10;
		}
		if(res>Integer.MAX_VALUE || res<Integer.MIN_VALUE) {
			return 0;
		}
		return (int)res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=123;
		
		System.out.println(reverseInt(x));
	}

}
