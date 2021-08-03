package collections;

public class CallyByValue {
public static void main(String[] args) {
	int a=12;
	System.out.println(a);
	test(a);
	System.out.println(a+"scope completed method");
}

private static void test(int a) {
	a=a+10;
	System.out.println(a+"with in the method");	
}
}
