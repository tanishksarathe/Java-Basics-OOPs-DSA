package string_basics;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		/*
		 * 
		 * String n1 = "Tanishk"; String n2 = "Tanishk";
		 * 
		 * 
		 * String n3 =new String("Tanishk"); String n4 =new String("Tanishk");
		 * 
		 * 
		 * System.out.println(n1 == n2);
		 * 
		 * String s1 = "love"; String s2 = "love";
		 * 
		 * System.out.println(s1.equals(s2));
		 * 
		 * StringBuilder s3 = new StringBuilder("love"); StringBuilder s4 = new
		 * StringBuilder("love");
		 * 
		 * System.out.println(s3.equals(s4)); System.out.println(s3 == s4);
		 * 
		 * 
		 * 
		 * StringBuilder stringBuilder = new StringBuilder(50);
		 * 
		 * stringBuilder.append("abcderyuipljkjmn1");
		 * 
		 * System.out.println(stringBuilder.length());
		 * 
		 * System.out.println(stringBuilder.capacity());
		 * 
		 */

//		SheetOne.printSheetOne();

//		System.out.println();

		SheetTwo.printsheetTwo();
	}

}

class SheetOne {

	public static boolean ques15(String str, String sub) {

		if (str.contains(sub))
			return true;

		return false;
	}

	public static boolean ques14(String str, String str1) {

		if (str.compareToIgnoreCase(str1) == 0)
			return true;

		return false;

	}

	public static String reverse(String str) {

		StringBuilder strb = new StringBuilder(str);

		String ans = new String(strb.reverse());

		return ans;
	}

	public static void ques12(String str) {

		StringBuilder sb = new StringBuilder(str);

		System.out.println(sb.append(" World"));

	}

	public static char ques11(String str, int index) {

		char c = str.charAt(index);

		return c;
	}

	public static boolean isEqual(String str1, String str) {

		return str1.equals(str);

	}

	public static boolean isEmpty(String str) {

		return str.isEmpty();

	}

	public static void ques8(String str) {

		System.out.println(str.replace('a', 'o'));

	}

	public static void ques7(String str, String str1) {

		System.out.println(str.concat(str1));

	}

	public static void ques6(String str) {

		System.out.println(str.trim());

	}

	public static void ques5(String str) {

		System.out.println(str.substring(0, 5));

	}

	public static void manualReverse(String str) {

		char c[] = str.toCharArray();

		int begin = 0;
		int end = c.length - 1;

		for (int i = 0; i < c.length / 2; i++) {

			char temp = c[begin];
			c[begin] = c[end];
			c[end] = temp;

			begin++;
			end--;

		}

		String str1 = new String(c);

		System.out.println(str1);

	}

	public static void ques3(String str) {

		System.out.println(str.toLowerCase());

	}

	public static void ques2(String str) {

		System.out.println(str.toUpperCase());

	}

	public static void ques1(String str) {

		System.out.println(str.length());

	}

	public static void printSheetOne() {

		String str1 = new String("Programming");

		System.out.println("Sheet 1 Begins");

		System.out.println();

		String str = new String("Java Programming");

		System.out.println(ques15(str, "Prog"));

		System.out.println();

		System.out.println(ques14("Java", "java"));

		System.out.println();

		System.out.println(reverse(str1));

		System.out.println();

		manualReverse(str1);

		System.out.println();

		String str2 = "Hello";

		ques12(str2);

		System.out.println();

		System.out.println(ques11(str2, 2));

		System.out.println();

		String str3 = "hello";

		System.out.println(isEqual(str3, str2));

		System.out.println();

		String str4 = new String("");

		System.out.println(isEmpty(str4));

		System.out.println();

		String str5 = "Java";

		ques8(str5);

		System.out.println();

		ques7(str2, str5);

		System.out.println();

		ques6("    Trimmed    ");

		System.out.println();

		ques5(str1);

		System.out.println();

		ques3("TANISHK");

		System.out.println();

		ques2("tanishk");

		System.out.println();

		ques1(str);
	}

}

class SheetTwo {

	public static void q1(String str) {

		String str1[] = str.split(" ");
		
		for (String v : str1) {
			System.out.println(v);
		}
	}

	public static void q2(String str) {

		String str1[] = str.split(",");

		for (String v : str1) {
			System.out.println(v);
		}

	}

	public static void q3(String str) {

		String strr[] = str.split("\\|");

		for (String val : strr) {
			System.out.println("[" + val + "]");
		}

	}

	public static void q4(String str) {

		String strrString[] = str.split("-", 3);

		for (String valString : strrString) {

			System.out.println(valString);
		}

	}

	public static void q5(String str) {

		String strr = str.replaceAll("^\\.+|\\.+$", "").trim();
		strr = strr.replaceAll("\\.+", " ");

		System.out.println(strr);

		String fin[] = strr.split(" ");

		StringBuilder sb = new StringBuilder();

		for (int i = fin.length - 1; i >= 0; i--) {

			sb.append(fin[i]);
			if (i != 0) {
				sb.append(".");
			}

		}

		String sbr = new String(sb);

		System.out.println(sbr);
	}

	
	
	public static void q6(String str) {

		int v = 0;
		int c = 0;

		str = str.toLowerCase();

		for (int i = 0; i < str.length(); i++) {
			
			if(Character.isLetter(str.charAt(i))) {
				
				if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
						|| str.charAt(i) == 'o' || str.charAt(i) == 'u') {
					v++;
				}
				else {
					c++;
				}
				
				
			}
			
		}
		System.out.println("Vowels : "+ v + " and " + "Consonants : "+c);
	}

	
	
	public static int minstring(String[] strs) {

		System.out.print("Length of minstring is : ");

		int len = strs[0].length();

		System.out.println("Length bhai " + len);

		for (int i = 0; i < strs.length; i++) {

			if (len > strs[i].length()) {
				len = strs[i].length();
			}

		}
		return len;
	}

	
	
	public static String prefix(String[] s) {

		Arrays.sort(s);

		StringBuffer strr = new StringBuffer();

		for (int i = 0; i < s[0].length(); i++) {

			char b = s[0].charAt(i);

			if (s[s.length - 1].charAt(i) == b) {

				strr = strr.append(b);

			} else {
				String stx = new String(strr);
				return stx;
			}

		}
		
		String stx = new String(strr);
		return stx;

	}

	
	
	public static int romanChar(char str) {

		switch (str) {
		case 'I':

			return 1;
		case 'V':

			return 5;
		case 'X':

			return 10;
		case 'L':

			return 50;
		case 'C':

			return 100;
		case 'D':

			return 500;
		case 'M':

			return 1000;

		default:
			return 0;
		}
		
	}
	public static void romanToInt(String str) {
		str = str.toUpperCase();
		
		int total = 0;
		int prev = 0;
		
		for(int i = str.length()-1; i >= 0; i--) {
			
			char ch = str.charAt(i);
			
			int curr = romanChar(ch);
			
			if(curr > prev) {
				total += curr;
			}
			else {
				total-= curr;
			}
			prev = curr;
		}
		System.out.println(total);
	}
	
	
	
	public static boolean brackets(String str) {
		
		String prevString;
		do {
			prevString = str;
			
			str = str.replace("()", "");
			str = str.replace("{}", "");
			str = str.replace("[]", "");
		}while(!str.equals(prevString));
		
		return str.isEmpty();
	}
	
	
	
	public static int checkSubString(String s, String ss) {
		
		return s.indexOf(ss);
		
	}
	
	
	
	public static int lastStringlength(String s) {
		
		String fin[] = s.trim().split(" ");
		
		return fin[fin.length-1].length();
				
		
	}
	
	
	
	public static String convertBinarytoDecimal(int a) {
		
		if(a==0) return ""; 
		
		return convertBinarytoDecimal(a/2) +""+ a%2;
	}
	public static int decimalValue(int str, int k) {
		
		if (str==0) return 0;
		
	    return (str%10)*k + decimalValue(str/10,k*=2);

	}
	public static String binarySum(String a, String b) {
		
		int str = Integer.parseInt(a);
		
		int str2 = Integer.parseInt(b);
		
		int val1 = decimalValue(str,1);
		
		int val2 = decimalValue(str2,1);
		
		int fin = (val1 + val2);
		
		return convertBinarytoDecimal(fin);
		
	}
	
	

	
	
	public static boolean palindrome(String str) {
		
		char s[] = str.toLowerCase().toCharArray();
		
		int left = 0;
		int right = s.length-1;
		
		boolean flag = false;
		
		do {
			
			for(int i = 0; i < s.length; i++) {
				
				
				
			}
			
			
		} while (left < right && flag);
		
		System.out.println(Arrays.toString(s));
		return true;
	}
	
	
	
	
	public static boolean goals(String s, String goal) {
				
		return s.concat(s).contains(goal);
		
	}
	
	
	
	public static int prevDays(String s) {
		
		String str[] = s.split("-");
		
		int daycount = 0;
		
		int date = Integer.parseInt(str[2]);
		
		int month = Integer.parseInt(str[1]);
		
		int year = Integer.parseInt(str[0]);
		
		int[]monthDays = {31,28,31,30,31,30,31,31,30,31,30,31}; 
		
		if( ( year % 4 == 0 && year % 100 != 0 ) || year % 400 == 0) {
			
			monthDays[1] = 29;
			
		}
		
		for(int i = 0; i < month-1; i++) {
			daycount+=monthDays[i];
		}
		
		
		daycount+=date;
		
		return daycount;
	}
	

	
	
	public static String ques16(String s, int[]arr) {
		
		char[]result = new char[arr.length];
		
		for(int i = 0; i < result.length; i++) {
			
			result[arr[i]] = s.charAt(i);
			
		}
		
		return new String(result);	
	
	}
	
	
	public static void printsheetTwo() {

		System.out.println("Sheet 2 begins");

		System.out.println();
		
		System.out.println(palindrome("A man, a plan, a canal: Panama"));
		
		System.out.println();
		
		System.out.println(binarySum("1010", "1011"));
	
		System.out.println();
		
		q6("Java-123!");
		
		int []a = {4,5,6,7,0,2,1,3};
		
		System.out.println(ques16("codeleet", a));
		
		System.out.println();
		
		System.out.println(prevDays("2019-02-10"));
		
		
		
		
		System.out.println();

		q1("Java is fun");

		System.out.println();

		q2("John,David,Tanishk,Michael,Robert");

		System.out.println();

		q3("A|B|||C|");

		System.out.println();

		q4("Java-is-a-popular-language");

		System.out.println();

		q5("..i.like....this.program...very.much..");

		String s = "Tanishk";

		System.out.println(s.length());

		System.out.println();

		String str[] = { "flower", "flow", "flight" };

		System.out.println(prefix(str));
		
		romanToInt("CDXLIV");
		
		System.out.println();
		
		System.out.println(brackets("({[]})"));
		
		System.out.println();
		
		System.out.println(checkSubString("sadbutsad", "sad"));
		
		System.out.println();
		
		System.out.println(lastStringlength("  fly to the  moon  "));

		System.out.println();
		
		System.out.println(goals("abcde", "cdeab"));
	
	}

}
