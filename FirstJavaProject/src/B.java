
public class B {
	String msg1;
	String msg2;
	public B() {
		this("Hello", "World!");
	}
	
	public B(String m1,String m2) {
		msg1=m1;
		msg2=m2;
	}
	
	public void print() {
		System.out.println(msg1+" "+msg2);
	}
}
