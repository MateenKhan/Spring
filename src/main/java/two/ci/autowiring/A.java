package two.ci.autowiring;

public class A {
	B b;
	C c;

	public C getC() {
		return c;
	}

	public void setC(C c) {
		this.c = c;
	}

	A(B b) {
		System.out.println("a one arg is created");
	}

	A() {
		System.out.println("a is created");
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

	void print() {
		System.out.println("hello a");
	}

	void display() {
		print();
		if (b != null)
			b.print();
		if (c != null)
			c.print();
	}
}