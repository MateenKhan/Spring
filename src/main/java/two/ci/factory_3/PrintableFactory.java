package two.ci.factory_3;

public class PrintableFactory {
	// non-static factory method
	public Printable getPrintable() {
		return new A();// return any one instance, either A or B
	}
}