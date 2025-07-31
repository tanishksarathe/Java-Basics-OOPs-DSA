package pack1;

public class Unary {

	public static void q1() {
		
		int x = 8;
		int y = x++;
		
		System.out.println(x);
		System.out.println(y);
		
	}
	
	public static void q2() {
		
		int x = 10;
		int y = x++;
		y = x++;
		
		System.out.println(x);
		System.out.println(y);
		
	}
	
	public static void q3() {
		int a = 20;
		a++;
		int b = a++;
		b = a++;
		b++;
		a = b++;
		
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void q4() {
		
		int x = 25;
		int y = x++;
		y++;
		x = y++;
		int z = x++;
		y = z++;
		x = z++;
		x++;
		y = x++;
		z = y++;
		y = y++;

		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
	
	public static void q5() {
		int a = 55;
		int b = a++;
		b++;
		int c = b++;
		a = c++;
		b = c++;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	
	public static void pre1() {
		
		int p = 20;
		int q = ++p;
		System.out.println(p); 
		System.out.println(q); 

		
	}
	
	
	public static void pre2() {
		
		int m = 100;
		++m;
		int n = ++m;
		int o = ++n;
		++o;
		System.out.println(m); 
		System.out.println(n); 
		System.out.println(o); 

		
	}
	
	public static void pre3() {
		
		int v = 45;
		++v;
		int w = ++v;
		w = ++w;
		v = ++w;
		v++;
		System.out.println(v);
		System.out.println(w); 
		
	}
	
	
	public static void q6() {
		int p = 20;
		int q = p--;
		System.out.println(q);
		System.out.println(p); 
	}
	
	public static void q7() {
		
		int x = 95;
		x--;
		int y = x--;
		y = y--;
		System.out.println(x); 
		System.out.println(y); 

		
	}
	
	public static void q8() {
	
		int a = 50;
		int b = a--;
		b--;
		int c = b--;
		a = c--;
		b = c--;
		b--;
		System.out.println(a); 
		System.out.println(b); 
		System.out.println(c); 
		
	}
	
	public static void q9() {
		
		int x = 20;
		int y = --x;
		--x;
		System.out.println(x); 
		System.out.println(y); 
		
	}
	
	public static void q10() {
	
		int a = 10;
		--a;
		int b = --a;
		System.out.println(a); 
		System.out.println(b); 
		
	}
	
	
	public static void q11() {
		
		int a = 215;
		--a;
		int b = --a;
		--b;
		int c = --b;
		a = --c;
		b = --c;
		System.out.println(a); 
		System.out.println(b); 
		System.out.println(c); 
		
	}
	
	
	public static void q12() {
		
		int m = 8;
		++m;
		int n = ++m;
		n--;
		int p = n--;
		m = p--;
		n = p++;
		System.out.println(m); 
		System.out.println(n); 
		System.out.println(p); 
		
	}
	
	
	public static void q13() {
		
		int a = 7;
		++a;
		int b = ++a;
		b--;
		int c = b--;
		a = c++;
		b = c--;
		System.out.println(a); 
		System.out.println(b); 
		System.out.println(c); 

		
	}
	
	
	public static void q14() {
		
		int x = 50;
		int y = x++;
		x--;
		y = ++x;
		int z = --y;
		x = ++z;
		z++;
		x = z;
		y = --x;
		x = ++y;
		z = --x;
		System.out.println(x);
		System.out.println(y); 
		System.out.println(z); 
		
	}
	
	
	public static void q15() {
		int a = 60;
		int b = a--;
		int c = ++b;
		a = --c;
		b = a++;
		c = --b;
		a = ++c;
		b = --a;
		c = b++;
		a = ++c;
		b = --a;
		System.out.println(a); 
		System.out.println(b); 
		System.out.println(c); 
	}
	
	public static void q16() {
		
		int a = 15;
		int b = --a + a++;
		System.out.println(a); 
		System.out.println(b); 

		
	}
	
	
	public static void q17() {
		
		int i = 18;
		int j = ++i - --i + i++;
		System.out.println(i); 
		System.out.println(j); 

		
	}
	
	public static void q18() {
		
		int m = 7;
		int n = --m + m-- + ++m;
		System.out.println(m); 
		System.out.println(n); 
		
	}
	
	
	public static void q19() {
		
		int x = 12;
		int y = x++ + ++x - x-- + --x;
		System.out.println(x); 
		System.out.println(y); 
		
	}
	
	
	public static void q20() {
		
		int a = 30;
		int b = ++a + a++;
		int c = ++b + ++a + a++;
		int d = ++c + --a;
		System.out.println(a); 
		System.out.println(b); 
		System.out.println(c); 
		System.out.println(d); 
		
	}
	
	public static void q21() {
		
		int x = 50;
		int y = ++x + x++;
		int z = ++y * x++ - y++;
		int w = ++z + x++ + y++;
		System.out.println(x); 
		System.out.println(y); 
		System.out.println(z); 
		System.out.println(w); 
		
	}
	
	
	
	public static void main(String[] args)
	{
		q1();
		
		System.out.println();
		
		q2();
		
		System.out.println();
		
		q3();
		
		System.out.println();
		
		pre1();
		
		System.out.println();
		
		pre2();
		
		System.out.println();
		
		pre3();
		
		System.out.println();
		
		q4();
		
		System.out.println();
		
		q5();
		
		System.out.println();
		
		q6();
		
		System.out.println();
		
		q7();
		
		System.out.println();
		
		q8();
		
		System.out.println();
		
		q9();
		
		System.out.println();
		
		q10();
		
		System.out.println();
		
		q11();
		
		System.out.println();
		
		q12();
		
		System.out.println();
		
		q13();
		
		System.out.println();
		
		q14();
		
		System.out.println();
		
		q15();
		
		System.out.println();
		
		q16();
		
		System.out.println();
		
		q17();
		
		System.out.println();
		
		q18();
		
		System.out.println();
		
		q19();
		
		System.out.println();
		
		q20();
		
		System.out.println();
		
		q21();
		

	}

}
