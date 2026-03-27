package ProgramCode;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepetedCharacter {

	public static void main(String[] args) {
		String text="aabbcdde";
	System.out.println(firstNonRepeatedCharacter(text));
	}


	public static Character firstNonRepeatedCharacter(String text) {

		char[] t=text.toCharArray();
		Map<Character,Integer> map=new HashMap<Character,Integer>();

		for(char ch:t) {   //aabbcdde
			
			if(map.containsKey(ch)) {
				map.put(ch,map.get(ch)+1);
			}else {
				map.put(ch,1);
			}
		}
		
		for(Map.Entry<Character,Integer> entry:map.entrySet()) {
			if(entry.getValue()==1) {
				return entry.getKey();
			}
		}



    return null;
		
	}



}
