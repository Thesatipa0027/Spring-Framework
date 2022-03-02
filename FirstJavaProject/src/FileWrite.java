import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
	public static void main(String[] args) {
		String path = "C:\\Users\\Sateesh Patil\\Desktop\\New folder\\Order report.txt";
		File file = new File(path);
		try {
//			FileWriter fWriter = new FileWriter(path,true);
//			fWriter.append("Written1 ");
//			fWriter.close();
			
			 FileWriter fileWritter = new FileWriter(path,true);
	         BufferedWriter bw = new BufferedWriter(fileWritter);
	         bw.write(" Written again \n");
	         bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
