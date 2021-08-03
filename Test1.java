

public class Test1 {
public static void main(String[] args) {
	

	int k=10/2;
	System.out.println(k);
	int k1=10/4;
	System.out.println(k1);
	try
	{
	int k2=10/0;
	}
	catch(ArithmeticException e)
	{
	System.out.println("excetption raisied");
	}
	int k3=10/3;
	System.out.println(k3);
	
}
}
