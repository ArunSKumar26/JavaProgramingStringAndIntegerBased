package ProgramCode;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {
		String text="automation";
	String outPut=removeDuplicateFromString(text);
	System.out.println(outPut);



	}

	public static String removeDuplicateFromString(String text) {
     
	    Set<Character> s=new LinkedHashSet<Character>();
		char[] t=text.toCharArray();
		StringBuilder sb=new StringBuilder();
		for(char a:t) {
			s.add(a);
		}
		
		
		Iterator<Character> it = s.iterator();
		while(it.hasNext()) {
			sb.append(it.next());
		}

		return sb.toString();

	}

}
