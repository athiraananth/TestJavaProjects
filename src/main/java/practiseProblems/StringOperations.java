package practiseProblems;

public class StringOperations {
	
	public static void stringFunctions(String mtext) {
	
		System.out.println(mtext.subSequence(1,4));
		System.out.println(mtext.substring(1,4));
	}

	public static void main(String[] args) {
		
		String text="Eagles fly high";
		String a="abc";
		String b="bcd";
		System.out.println(a+b);
		System.out.println(a.concat(b));
		a.concat("efg");
		System.out.println(a);
		StringBuilder c= new StringBuilder();
		c.append(b);
		System.out.println(c.charAt(2));
		StringOperations so=new StringOperations();
		so.stringFunctions(text);
	}

}
