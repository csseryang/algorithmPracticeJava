
/*
Longest Palindromic

Given a string S, find the longest palindromic substring in S.
 You may assume that the maximum length of S is 1000, 
 and there exists one unique longest palindromic substring.

Given the string = "abcdzdcab", return "cdzdc".

*/

public String longestPalinSubstr(String s){

	if(s == null || s.length() == 0){
		return s;
	}

	int len = s.length();
	int max = 1;
	String res = "";

	for(int i = 1; i < 2*len; i++){
		int count = 1;
		
		// expand from the middle
		while( i - count >= 0 && i + count < 2*len && get(s, i - count) == get(s, i + count)){
			count++;
		}
		count--;
		if(count > max){
			max = count;
			res = s.substring( (i-count)/2, (i+count)/2);
		}
	}
	return res;
}