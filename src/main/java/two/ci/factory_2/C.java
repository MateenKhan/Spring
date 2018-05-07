package two.ci.factory_2;

public class C {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	C() {
		System.out.println("c is created");
	}

	void print() {
		System.out.println("hello name:"+name);
	}
}