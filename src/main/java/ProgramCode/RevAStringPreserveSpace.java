package ProgramCode;

import java.util.ArrayList;
import java.util.List;

public class RevAStringPreserveSpace {

	public static void main(String[] args) {
		String text="internship at geeks for geeks";  //skeegrofsk ee gtapi hsn retni
		String	outPut=reversePreserving(text);
		System.out.println(outPut);

	}
	
	public static String reversePreserving(String text) {
	
		char[] t=text.toCharArray();
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<=t.length-1;i++) {
        	if(t[i]==' ') {
        		list.get(i);
        	}
        }
        System.out.println(list);

		String text1=text.replace("","");
		String rev="";
		for(int i=text1.length()-1;i>=0;i--) {
			rev=rev+t[i];
		}
		System.out.println(rev);
		
		StringBuilder sb=new StringBuilder(rev);
		
		for(int i=0;i<list.size();i++) {
			sb.insert(list.get(i)," ");
		}

		return sb.toString();

	}
	

}
