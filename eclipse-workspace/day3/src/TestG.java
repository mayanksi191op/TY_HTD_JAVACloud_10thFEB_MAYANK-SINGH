
public class TestG {

	public static void main(String[] args) {
		GenThree t=new GenThree();
		System.out.println("........Third gen methods...........");
		t.docall();
		t.mesg();
		t.music();
		t.camera();
		
		GenTwo s=new GenTwo();
		System.out.println("...........Second gen methods.........");
		s.docall();
		s.mesg();
		s.music();
		
		GenOne o=new GenOne();
		System.out.println("..........First gen methods.........");
		o.docall();
		o.mesg();
		
	}

}
