
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Datetimefrmt {
		public static void main(String[] args) {
			DateTimeFormatter FOMATTER = DateTimeFormatter.ofPattern("yyyy/MM/dd  hh:mm:ss a");
			LocalDateTime localDateTime = LocalDateTime.now();
			System.out.println(FOMATTER.format(localDateTime));
			
//			LocalDateTime aLDT = LocalDateTime.parse(FOMATTER.format(localDateTime));
//			System.out.println(aLDT);
		}
}
