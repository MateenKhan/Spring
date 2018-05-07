package three.anno.aop;

public class Operation {
	public void msg() {
		System.out.println("msg method invoked");
	}

	public int m() {
		System.out.println("m method invoked");
		return 2;
	}

	public int k() {
		System.out.println("k method invoked");
		return 3;
	}
	
	public String login(String username, String password) throws Exception{
		System.out.println("login method invoked");
		if(username==null) {
			throw new Exception("invalid input");
		}
		return "success:bingo";
	}
}