package collections;

import com.itextpdf.text.log.SysoLogger;

public class stringmethods {
public static void main(String[] args) {
	/*
	 * String s="ramkrishna"; String s1="ram"; String s2="krishna"; String
	 * s3=s1+"krishna"; System.out.println(s==s3);//reference checking
	 * System.out.println(s.equals(s3));//content checking String s4=new
	 * String("slokam"); String s5="slokam"; String s6="slokamtech"; String s7=new
	 * String("slokamtech"); System.out.println(s6==s7);//reference checking
	 * System.out.println(s6.equals(s7));//content checking
	 */String a=new String("apple");
	String b="apple";
	String c=new String("apple");
	c.intern();//it is check content pool if it alredy exist it assign already existed
	System.out.println(a==c);
	System.out.println(a.equals(b));
	String d="ball";
	String e=b+d;
	String f="apppleball";
	String g=new String("appleball");
	System.out.println(e.equals(g));
	
}
}
