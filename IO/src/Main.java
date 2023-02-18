import java.io.IOException;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		/* 
		try {
			int i = System.in.read();
			System.out.println((char)i); //returns ASCII code of 1st character  
		}catch(IOException e) {
			System.err.println("Error");
		}
		*/
		FileExample.run2();
		FileExample.run5();
		
		BufferExample.run2();
		
		DataExample.run1();
		//DataExample.run2();
		
		
		
	}

}
