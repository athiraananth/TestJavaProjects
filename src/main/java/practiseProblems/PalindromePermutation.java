package practiseProblems;

import java.util.HashSet;

public class PalindromePermutation {
	
	public boolean IsPalindrome(String input) {
		HashSet<Character> characters=new HashSet<Character>();
		boolean flag=false;
		for(int i=0;i<input.length();i++) {
			
			if(characters.contains(input.charAt(i))) {
				characters.remove(input.charAt(i));
			}
			else {
				characters.add(input.charAt(i));
			}
		}
		
		/*if(characters.size()<=1) {
			flag=true;
		}*/
		return (characters.size()<=1);
	}

}
