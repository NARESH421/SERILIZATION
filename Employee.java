package collections;

public class Employee implements Comparable<Employee>{
	private Integer eid;
	private String ename;
	private String edesg;
	private Integer esal;
	private String edept;

	public Employee(Integer eid,String ename,String edesg,Integer esal,String edept)
	{
		this.eid=eid;
		this.ename=ename;
		this.edept=edept;
		this.esal=esal;
		this.edesg=edesg;
	}
public Integer getEid() {
	return eid;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", edesg=" + edesg + ", esal=" + esal + ", edept=" + edept
			+ "]";
}
public void setEid(Integer eid) {
	this.eid = eid;

}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getEdesg() {
	return edesg;
}
public void setEdesg(String edesg) {
	this.edesg = edesg;
}
public Integer getEsal() {
	return esal;
}
public void setEsal(Integer esal) {
	this.esal = esal;
}
public String getEdept() {
	return edept;
}
public void setEdept(String edept) {
	this.edept = edept;
}
@Override
public int compareTo(Employee emp) {
		return 0;
}
}
