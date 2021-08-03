package collections;

import java.util.Scanner;
import java.util.TreeSet;

public class TreesetTestcompare2 {
	public static void main(String[] args) 
	{
		Student s1=new Student();
		s1.setAge(21);
		s1.setMarks(456);
		s1.setSid(1);
		s1.setSname("naresh");
		
		Student s2=new Student();
		s2.setAge(13);
		s2.setMarks(457);
		s2.setSid(2);
		s2.setSname("drithi");
		
		Student s3=new Student();
		s3.setAge(13);
		s3.setMarks(458);
		s3.setSid(3);
		s3.setSname("apple");
		
		Student s4=new Student();
		s4.setAge(18);
		s4.setMarks(459);
		s4.setSid(4);
		s4.setSname("Ant");
		TreeSet<Student> t=new TreeSet();
					
//System.out.println(t);
		
		System.out.println("enter your choice");
		System.out.println("1.ID");
		System.out.println("2.Name");
		System.out.println("3.Age");
		System.out.println("4.Marks");
		Scanner sc=new Scanner(System.in);
		
		int x=sc.nextInt();
		System.out.println("enter your choice for ASC/DSC");
		System.out.println("1.ASC");
		System.out.println("2.DSC");
		int x1=sc.nextInt();
		switch (x) {
		case 1: if(x==1 &&  x1==1) {
			t=new TreeSet(new stdbasedonId());
			}//if
		else {
			t=new TreeSet(new stdbasedonId().reversed());
		}
			
			break;
		case 2:
			if(x==2 &&  x1==1) {
				t=new TreeSet(new stdbasedonname());
				}//if
			else {
				t=new TreeSet(new stdbasedonname().reversed());
			}
				
				break;

		case 3:
			if(x==3 &&  x1==1) {
				t=new TreeSet(new stdbasedonage());
				}//if
			else {
				t=new TreeSet(new stdbasedonage().reversed());
			}
				
				break;

		default:
			if(x==4&&  x1==1) {
				t=new TreeSet(new stdbasedonmarks());
				}//if
			else {
				t=new TreeSet(new stdbasedonmarks().reversed());
			}
				
				

			
		}//switch
					t.add(s1);
					t.add(s2);
					t.add(s3);
					t.add(s4);
					
					
					for (Student student : t) {
						System.out.println(student);
					}
			
		}//main




}