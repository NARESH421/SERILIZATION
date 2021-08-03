package serialization;

public class CloingPurpose {
public static void main(String[] args) {
	Employee e=new Employee();
	e.setEid(1);
	e.setEname("naresh");
	e.setEdept("developer");
	e.setEage(25);
	Addres a=new Addres();
	a.setOfcaddress("sr ngara");
	a.setPhyaddress("gachi bowli");
	e.setAdd(a);
	Person p=new Person();
	p.setPid(1);
	p.setPname("saiteja");
	e.setPer(p);
	Employee e1=null;
	Addres a1=null;
	try
	{
		e1=(Employee) e.clone();
		//a1=(Addres)a.clone();		
		e.setEage(90);
		a.setOfcaddress("miryalaguda");
		e1.setEdept("senior");//only one changed the values
		p.setPname("madukar");
		
		//a1=(Addres) a.clone();
	}
	catch(Exception ex)
	{
		ex.printStackTrace();
	}
	System.out.println(e1+"\n"+e);
}
}
