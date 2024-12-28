package date28;

class AddDemo {
	void add(int a, int b) {
		System.out.println("a+b...." + (a + b));
	}

	void add(int a, int b, int c) {
		System.out.println("a+b+c...." + (a + b + c));
	}

	void add(String firstname, String lastname) {
		System.out.println("full name--->" + firstname + "" + lastname);
	}
}

public class OverLodeDemo{
	public static void main(String[] args) {
		AddDemo adddemo = new AddDemo();
		adddemo.add(100, 2000);
		adddemo.add("basha", "allur");
		adddemo.add(100, 2000, 300);
	}

	public static void main(String fname, String lname) {
	}

}