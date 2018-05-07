package two.ci.factory;

public class B {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	B(String name) {
		this.name=name;
		System.out.println("b one arg constructor");
	}
	B() {
		System.out.println("b is created");
	}

	void print() {
		System.out.println("hello name:"+name);
	}
}