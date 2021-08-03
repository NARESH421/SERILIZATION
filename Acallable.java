package collections;

public class Acallable extends callable {
	public static void main(String[] args) {
		System.out.println("testing");
		callable c=new callable();
		try {
			c.call();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
