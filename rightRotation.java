
/*
	Right Rotation 
	Example: waterbottle -> erbottlewat
*/
package com;

public class Test {

	public static boolean rightRotataion(String s1, String s2){
		
		if(s1.length() == 0 || s1.length() != s2.length()){
			return false;
		}
		
		s1 = s1 + s1;
		return s1.contains(s2) ? true: false;
	}
	
	public static void main(String[] args) {
		
		String s1 = "waterbottle";
		String s2 = "erbottlewat";
		
		System.out.println( rightRotataion(s1, s2) );

	}

}
