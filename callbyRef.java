package collections;

public class callbyRef {
	public static void main(String[] args) {
		String str="abc";
		stdinfo s=new stdinfo(1, "naresh", 789);
		System.out.println(str);
		System.out.println(s);
		callby(str,s);
		System.out.println(s+"       "+str);
		callbyreftest(s);
		System.out.println(s);
	}

	private static void callbyreftest(stdinfo s) {
		s.setId(4);
	}

	private static void callby(String str, stdinfo s) {
		str=str+"nari";
		s.setId(5);
		
	}}