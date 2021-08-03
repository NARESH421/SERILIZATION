package collections;

import java.util.Map;

public class IdentityHashMap {
public static void main(String[] args) {
	String s="slokam";
	String s1="slokamtest";
	String s2="slokam";
	String s3="slokamtest";
	String s4=new String("slokam");
	String s5=new String("slokam");
	
	System.out.println(s5==s4);;
	System.out.println(s==s5);
	System.out.println(s==s2);
	Map<String,Integer> k=new java.util.IdentityHashMap<>();
	k.put(s, 11);
	k.put(s1, 12);
	k.put(s2, 13);
	k.put(s3, 14);
	System.out.println(k);
	
}
}
