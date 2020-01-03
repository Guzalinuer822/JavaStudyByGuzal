package day39_finalKeyword;

public class TestParentChild {

	public static void main(String[] args) {

		Child s = new Child();

		System.out.println("value of x before increment: " + s.x);

		s.increment();
		System.out.println("value of x after increment: " + s.x);

/*----------------------------------------------------------------------*/
		
		Parent p = new Parent();

		System.out.println("value of x before increment: " + p.x);

		p.increment();
		System.out.println("value of x after increment: " + p.x);

	}

}
