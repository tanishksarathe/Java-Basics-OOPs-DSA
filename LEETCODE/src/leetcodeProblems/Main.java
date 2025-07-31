package leetcodeProblems;

import java.util.Arrays;

public class Main {

	public static void lengthOflastWord(String str) {

		String c[] = str.split(" ");
		System.out.println(c[c.length - 1].length());

	}

	public static int lengthOfLongestSubString(String s) {

		StringBuilder sb = new StringBuilder();
		
//		if(s.length() == 1) return 1;

		for (int i = 0; i < s.length(); i++) {

			boolean flag = true;
			
			for(int j = 0; j < sb.length(); j++)
			{

				if (s.charAt(i) == sb.charAt(j)) {

					flag = false;
					break;
					
				} else if (s.charAt(i) != sb.charAt(j)) {
					continue;
				}

			}

			if (flag) {
				sb.append(s.charAt(i));
			}

		}
			
		return sb.length(); 
	}

	public static int minstring(String[] strs) {

		int len = strs[0].length();

		for (int i = 0; i < strs.length; i++) {

			if (strs[i].length() < len) {
				len = strs[i].length();
			}

		}
		return len;
	}

	public static String longestCommonPrefix(String[] strs) {

		int len = minstring(strs);

		if (strs == null)
			return "";

		StringBuilder strrrr = new StringBuilder();

		for (int i = 0; i < len; i++) {

			char c = strs[0].charAt(i);

			for (int j = 0; j < strs.length; j++) {

				char b = strs[j].charAt(i);

				boolean flag = false;

				if (b == c) {

					flag = true;

				} else {

					String strrrrr = new String(strrrr);

					return strrrrr;

				}
				if (j == strs.length - 1 && flag) {

					strrrr.append(strs[j].charAt(i));

				}
				if (!flag) {

					strrrr.append("");

				}

			}

		}

		String strrrrr = new String(strrrr);

		return strrrrr;
	}

	public static void main(String[] args) {

		String str[] = { "flower", "flow", "flight" };

		String str1[] = { "hello", "world" };

//
		System.out.println(lengthOfLongestSubString("pwwkew"));

		System.out.println(lengthOfLongestSubString(" "));

		System.out.println(lengthOfLongestSubString("abcabcbb"));

//		lengthOflastWord("luffy is still joyboy");

//		System.out.println(longestCommonPrefix(str1));

	}

}
