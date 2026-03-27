package ProgramCode;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {
		String text="automation";  //automin
		System.out.println(removeDuplicateCharacter(text));
	}

	public static String removeDuplicateCharacter(String text) {
		char[]	t=text.toCharArray();
		Set<Character> s=new LinkedHashSet<Character>();
		StringBuilder sb=new StringBuilder();
		String remDep="";
		for(int i=0;i<=t.length-1;i++) {
			s.add(t[i]);
		}

		for(char a:s) {   //with string builder
			//sb.append(a);  //Stringbuilder append
            remDep=remDep+a;
		}

		return remDep;
	}

}
