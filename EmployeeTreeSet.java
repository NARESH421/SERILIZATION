package collections;

import java.util.Scanner;
import java.util.TreeSet;

public class EmployeeTreeSet {
	public static void main(String[] args) {

Employee e1=new Employee(1,"naresh","devop",5689,"software");
Employee e2=new Employee(2,"sai","frontend",2689,"tester");
Employee e3=new Employee(3,"naresh","devop",6689,"tl");
Employee e4=new Employee(4,"madhu","spring",3689,"software");
Employee e5=new Employee(5,"praveen","securit",4589,"mangager");
TreeSet<Employee> tr=null;
System.out.println("enter 1 for asc and 2 for desc");
System.out.println("enter x");
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
if(x==1)
{
	System.out.println("ascending order");
	System.out.println("enter u choice 1 id,2 name,3 desg,4 sal,5 department");
	int n=sc.nextInt();
	switch(n)
	{
	case 1:
			tr=new TreeSet(new empbasedonid());
			break;
	case 2:
			tr=new TreeSet(new empbasedonname());
			break;
	case 3:
			tr=new TreeSet(new empbasedondesg());
			break;
	case 4:
			tr=new TreeSet(new empbasedonesal());
			break;
	case 5:
			tr=new TreeSet(new empbasedondept());
			break;
	default:System.out.println("enter wrong choice");
	}}
	else
		if(x==2)
		{
			System.out.println("enter u choice 1 id,2 name,3 desg,4 sal,5 department");
			int n=sc.nextInt();
			switch(n)
			{
			case 1:
					tr=new TreeSet(new empbasedonid().reversed());
					break;
			case 2:
					tr=new TreeSet(new empbasedonname().reversed());
					break;
			case 3:
					tr=new TreeSet(new empbasedondesg().reversed());
					break;
			case 4:
					tr=new TreeSet(new empbasedonesal().reversed());
					break;
			case 5:
					tr=new TreeSet(new empbasedondept().reversed());
					break;
			default:System.out.println("enter wrong choice");
			}
			
		}
			

tr.add(e2);
tr.add(e1);
tr.add(e4);
tr.add(e3);
tr.add(e5);

for (Employee em : tr) {
	System.out.println(em.getEid()+"  "+em.getEname()+"  "+em.getEdept()+"   "+em.getEdesg()+"  "+em.getEsal());
	
}
	
}}

