import java.util.Scanner;

public class StringTest {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
//		System.out.println("Enter either Y/N:");
//		String s=scan.nextLine();
//		
//		if(s.length()>1) {
//			System.out.println("Please provide only one character");
//			return;
//		}
//		if(s.equalsIgnoreCase("Y")||s.equalsIgnoreCase("y"))
//			System.out.println("Welcome!");
//		else if(s.equalsIgnoreCase("N")||s.equalsIgnoreCase("n"))
//			System.out.println("Good Bye!");
//		else 
//			System.out.println("Please provide correct input!");
		
		
		
		System.out.println("Enter either Y/N:");
		String s=scan.nextLine();
		
		if(s.length()<1) {
			System.out.println("Please proide atleast one character");
			return;
			}
		if(s.length()!=1) {
			System.out.println("Please provide only one character");
			return;
		}
		char c=s.charAt(0);
		if(c=='Y'||c=='y')
			System.out.println("Welcome!");
		else if(c=='N'||c=='n')
			System.out.println("Good Bye!");
		else 
			System.out.println("Please provide correct input!");
		
		
		scan.close();
	}
}
