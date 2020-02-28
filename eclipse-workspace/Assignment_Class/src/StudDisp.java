
public class StudDisp {
	public void disp(Student s[])
	{
		for(Student x: s) {
		System.out.println("Id is "+x.getId());
		System.out.println("Name is "+x.getName());
		System.out.println("Height is"+x.getHeight());
		
		System.out.println("-------------------------------");
	}

}}
