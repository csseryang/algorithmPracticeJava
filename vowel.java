

/*
	Remove Vowel 去元音
	
*/
package com;

public class Test {

	public static String vowel(String s){
		String temp = "aeiouAEIOU";
		
		String res = "";
		for(int i = 0; i < s.length(); i++){
			if(temp.contains("" + s.charAt(i) )) continue;
			
			res = res + s.charAt(i);
		}	
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println( vowel("AMAZONaeiou") );
	}

}
