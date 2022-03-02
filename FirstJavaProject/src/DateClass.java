import java.util.Date;

public class DateClass {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		Date date1 = new Date(1);
		System.out.println(date1.compareTo(date));
	}
}
