package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class deser {
	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("E:\\serdata\\nari.txt");
			ObjectInputStream os=new ObjectInputStream(fis);
			Employee e=(Employee) os.readObject();
			System.out.println(e);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
