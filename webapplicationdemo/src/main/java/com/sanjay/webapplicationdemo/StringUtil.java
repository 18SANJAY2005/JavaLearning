package com.sanjay.webapplicationdemo;

public class StringUtil {
	String  str;
	boolean isPalindrome;

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
		isPalindrome = checkifPalindrome();
	}

	public StringUtil(String str) {
		this.str = str;
		isPalindrome = checkifPalindrome();
	}
	
	public boolean checkifPalindrome() {
		
		String s2 = "";
		boolean result;
		for (int i = str.length() - 1; i >= 0; i--) {
			s2 += str.charAt(i);
		}

		if (str.equals(s2)) {
			result = true;
		} else {
			result = false;
		}

		System.out.println("Palin method executed" + str + "--" + result);
		return result;
		
	}

	@Override
	public String toString() {
		return String.format("<h1>%s! is %s </h1>", str, isPalindrome ? "Palindrome":"Not Palindrome");
	}
			
	
	

}
