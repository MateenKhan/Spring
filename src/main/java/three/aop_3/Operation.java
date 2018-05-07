package three.aop_3;

public class Operation {
	public String msg(String input) throws Exception{
		System.out.println("msg method invoked");
		if(input==null) {
			throw new Exception("null input");
		}
		return "asdf";
	}

	public int m() {
		System.out.println("m method invoked");
		return 2;
	}

	public int k() {
		System.out.println("k method invoked");
		return 3;
	}
}