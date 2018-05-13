package seven;

public class Business {

	private Helper helper;

	public Helper getHelper() {
		return helper;
	}

	public void setHelper(Helper helper) {
		this.helper = helper;
	}

	public void printMsg(String msg) {
		System.out.println("business:"+msg);
	}

}
