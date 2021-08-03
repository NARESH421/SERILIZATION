package collections;

public class MutableString {
public static void main(String[] args) {
stdinfo s=new stdinfo(1, "naresh", 456);
System.out.println(s.toString());
stdinfo s1=s.setName("rakesh");
System.out.println(s1.toString());

stdinfo s2=s.setId(2);
System.out.println(s2.toString());

stdinfo s3=s.setMarks(673);
System.out.println(s3.toString());
}
}
