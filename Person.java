package serialization;

public class Person implements Cloneable {
private int pid;
private String pname;
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}

@Override
public String toString() {
	return "Person [pid=" + pid + ", pname=" + pname + "]";
}
public Object clone() throws CloneNotSupportedException
{
	
	
	return super.clone();
	
	
	
}
}
