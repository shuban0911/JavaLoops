import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		BufferedReader br = null;
		File f = new File("C:\\Users\\jdman\\eclipse-workspace\\JavaPractice\\new.txt");
		try {
			FileReader fr = new FileReader(f);
			 br = new BufferedReader(fr);
			System.out.println(br.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	br.close();
	

}
}
