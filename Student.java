 package collections;

public class Student implements Comparable<Student>{
	
	private Integer sid;
private String sname;
private Integer marks;
private Integer age;
public Integer getSid() {
	return sid;
}
public void setSid(Integer sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + age;
	result = prime * result + marks;
	result = prime * result + ((sid == null) ? 0 : sid.hashCode());
	result = prime * result + ((sname == null) ? 0 : sname.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	if (age != other.age)
		return false;
	if (marks != other.marks)
		return false;
	if (sid == null) {
		if (other.sid != null)
			return false;
	} else if (!sid.equals(other.sid))
		return false;
	if (sname == null) {
		if (other.sname != null)
			return false;
	} else if (!sname.equals(other.sname))
		return false;
	return true;
}
public void setSname(String sname) {
	this.sname = sname;
}
public Integer getMarks() {
	return marks;
}
public void setMarks(Integer marks) {
	this.marks = marks;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}

@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + ", marks=" + marks + ", age=" + age + "]";
}
/*
 * @Override public int compareTo(Student o) { // TODO Auto-generated method
 * stub System.out.println("i am at compare method"); return
 * this.age.compareTo(o.getAge()); }
 *//*
 * @Override public int compareTo(Student o) { // TODO Auto-generated method
 * stub System.out.println("i am at compare method"); return
 * this.sname.compareTo(o.getSname()); }
 */
@Override
public int compareTo(Student o) {
	// TODO Auto-generated method stub
	System.out.println("i am at compare method");
	return this.sname.compareTo(o.getSname());
}
public Student(Integer sid, String sname, Integer marks, Integer age) {
	 
	 super();
	 this.sid = sid; 
	 this.sname = sname; 
	 this.marks = marks;
	 this.age =age; 
	 }
}
