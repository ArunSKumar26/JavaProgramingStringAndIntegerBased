package ProgramCode;

public class IdentifyVowel {

	public static void main(String[] args) {
		String text="automation";
		System.out.println(vowel(text));
	}
	
	public static String vowel(String text) {
		char[] t=text.toCharArray();
		StringBuilder sb=new StringBuilder(text);
		String t1="";
		for(char a:t) {
			if(a=='a' || a=='i' || a=='o' || a=='e') {
				t1 += a + ",";
			}
		}
		
		
		
		return t1;
	}

}
