
import java.io.IOException;
import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.File;
//This class contains static methods to illustrate DataOutputStream 
//and DataInputSteam methods

public class DataExample {
	public static void run1() throws IOException{
		// instead of letting FileOutStream create a file, we
		// can create a file and pass it to the stream.
		//File fh = new File("data.txt");
		//FileOutputStream fout = new FileOutputStream(fh);
		
		FileOutputStream fout = new FileOutputStream("data.txt");
			
		DataOutputStream data = new DataOutputStream(fout);
		
		data.writeFloat((float) 4.0557282E-8);
		data.writeFloat((float) 3.14159);
		data.writeFloat((float) -44.234);
		
		data.flush();
		data.close();
		
		System.out.println("Succcess...");
		
	}
	public static void run2() throws IOException{
		FileInputStream input = new FileInputStream("data.txt");

		// to read data I wrap it
		DataInputStream inst = new DataInputStream(input);

		// cannot use -1 for EOF?
		// How do you look for EOF?

		// For data input stream we need to
		// use EXCEPTIONS to check for EOF!
		
		try {

			while (true) {
				float f = inst.readFloat();
				System.out.println(f);
			}

		} catch (Exception e) {
			System.out.println("read EOF");
		}
	}

	
}
