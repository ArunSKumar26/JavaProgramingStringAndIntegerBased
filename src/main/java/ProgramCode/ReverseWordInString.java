package ProgramCode;

public class ReverseWordInString {

	public static void main(String[] args) {
		String text="I love java";
		String[] t=text.split(" ");
        String rev="";
        for(int i=t.length-1;i>=0;i--) {
        	rev=rev+" "+t[i];
        }
        System.out.println(rev);


	}



}
