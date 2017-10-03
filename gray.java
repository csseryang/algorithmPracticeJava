
/*
Gray Code 判断byte1和byte2是不是相邻的Gray Code 
两个bytes 异或, 然后检查是不是只有一个1
*/
package com;

import java.util.Stack;

public class Test {

	public static boolean gray(int byte1, int byte2){
		
		int temp = byte1 ^ byte2; // xor
		int count = 0;
		
		while(temp != 0){
			temp = temp & (temp -1);
			count++;
		}
		return count == 1 ? true: false;
	}
	
	public static void main(String[] args) {
		
		int byte1 = 0; // 000 
		int byte2 = 1; // 001
		int byte3 = 2; // 011
		
		System.out.println( gray(byte1, byte2) );
		System.out.println( gray(byte2, byte3)  );
		System.out.println( gray(byte1, byte3)  );
	}

}
