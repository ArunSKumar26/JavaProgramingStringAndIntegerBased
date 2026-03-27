package ProgramCode;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountCharacterInString {

	public static void main(String[] args) {
		String text="automation";
		countCharacterInString(text);

	}
	
	public static void countCharacterInString(String text) {
		char[] t=text.toCharArray();
		Map<Character,Integer> map=new LinkedHashMap<Character, Integer>();
		
		for(char ch:t) {
			if(map.containsKey(ch)) {
				map.put(ch,map.get(ch)+1);
			}else {
				map.put(ch,1);
			}
		}
		
		System.out.println(map);
	}

}
