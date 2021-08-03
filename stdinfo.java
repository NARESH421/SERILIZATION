package collections;

public class stdinfo {
	private int id;
	private String name;
	private int marks;
	public int getId() {
		return id;
	}
	public stdinfo setId(int id) {
		this.id=id;
		return new stdinfo(id,this.name,this.marks);
	}
	public String getName() {
		return name;
	}
	public stdinfo setName(String name) {
		this.name=name;
		return new stdinfo(this.id,name,this.marks);
	}
	public int getMarks() {
		return marks;
	}
	public stdinfo setMarks(int marks) {
		this.marks = marks;
		return new stdinfo(this.id,name,marks);
	}
	public stdinfo(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "stdinfo [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

}
