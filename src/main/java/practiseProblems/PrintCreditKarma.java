package practiseProblems;

public class PrintCreditKarma {
	
	public static void printCreditKarma( int num) {
		
		if(num>=1 && num <=100) {
			if((num%5 == 0) && (num%7 == 0)) {
				System.out.println(" Credit Karma");
			}
			else if(num%7 ==0) {
				System.out.println("Karma");
			}
			else if(num%5 ==0) {
				System.out.println("Credit");
			}
		}else {
			System.out.println(" Invalid Input!!");
		}
		
		
	}

	public static void main(String[] args) {
		
		printCreditKarma(25);
		printCreditKarma(0);
		printCreditKarma(-1);
		printCreditKarma(101);
		printCreditKarma(21);
		printCreditKarma(35);

	}

}
