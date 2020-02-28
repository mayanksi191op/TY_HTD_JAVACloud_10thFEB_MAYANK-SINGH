
public class AssignTest {

	public static void main(String[] args) {
		Student[] s=new Student[5];
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		Student s5 = new Student();
		
		s[0]=s1;
		s[1]=s2;
		s[2]=s3;
		s[3]=s4;
		s[4]=s5;
		
		s1.setHeight(6.1);
		s1.setId(1);
		s1.setName("Mayank");

		s2.setHeight(5.2);
		s2.setId(2);
		s2.setName("Pankaj");

		s3.setHeight(5.4);
		s3.setId(3);
		s3.setName("Lodu");

		s4.setHeight(6.2);
		s4.setId(4);
		s4.setName("Sonu");

		s5.setHeight(5.2);
		s5.setId(5);
		s5.setName("Chomu");

		StudDisp sd=new StudDisp();
		sd.disp(s);



	}
}
