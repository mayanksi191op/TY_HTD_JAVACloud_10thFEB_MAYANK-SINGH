
public class TestD {

	public static void main(String[] args) {
		Card ap=new Card();
		Card d=new Card();
		Card mh=new Card();
		Card rs=new Card();

		ap.swipe();
		d.swipe();
		mh.swipe();
		rs.swipe();
		ap.swipe();

		System.out.println("total is "+Card.total);
		System.out.println("count in RS is "+rs.count);
		System.out.println("count is delhi is "+d.count);
		System.out.println("count in andra is "+ap.count);
		System.out.println("count in MH is "+mh.count);




	}

}
