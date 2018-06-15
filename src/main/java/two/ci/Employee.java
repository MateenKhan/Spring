package two.ci;

public class Employee {
	private int id;
	private String name;

	public Employee() {
		System.out.println("def cons");
	}

	public Employee(int id) {
		this.id = id;
		System.out.println("one arg int");
	}

	public Employee(String name) {
		this.name = name;
		System.out.println("one arg string");
	}

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("two arg int,string");
	}

	void show() {
		System.out.println("id:"+id + " name:" + name);
	}

}