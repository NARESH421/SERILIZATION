package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerData {
public static void main(String[] args) {
	Employee e=new Employee();
	e.setEid(1);
	e.setEname("naresh");
	e.setEdept("developer");
	e.setEage(25);
	try {
		FileOutputStream f=new FileOutputStream("E:\\serdata\\nari.txt");
		ObjectOutputStream o=new ObjectOutputStream(f);
		o.writeObject(e);
		o.close();
		f.close();
		System.out.println("done");
		
	} catch (Exception ex) {
		// TODO Auto-generated catch block
		ex.printStackTrace();
	}
}
}
