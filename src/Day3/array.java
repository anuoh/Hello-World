package Day3;

import java.util.Arrays;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        //arr to string
		char ch[] = {'a' ,'b' ,'c'};
		String s1 = String.valueOf(ch);
		System.out.println("s1 value:"  +s1);
		
		//str to int
		String str= "9";
		int num = Integer.parseInt(str);
		System.out.println(num);
		
		//int to string
		int x=65;
		String y= Integer.toString(x);
		System.out.println(x);
		System.out.println(y);
		
		//string to char
		String word = " I am studying and learning java";
		char[] cha = word.toCharArray();
		System.out.println(Arrays.toString(cha));
		//System.out.println(isSubstring("I am studying and learning java", "java"));		
		//find character at given location
		String st = "Hello World";
		System.out.println( "Index of H:" +st.indexOf("H"));
		
	//chk if two strings are same ignoring their cases	
		String str1="anu";
		String str2="ANU";
		if(str1.equalsIgnoreCase(str2)) {
			System.out.println("same");
		}else {
				System.out.println("not same");
		
	}

}}
