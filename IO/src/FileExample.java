import java.io.FileOutputStream;  
import java.io.IOException;
import java.util.Arrays;
import java.io.FileInputStream;

// This class contains static methods to illustrate FileOutputStream and FileInputSteam methods
public class FileExample {
	
	// FileOutputStream method write a char to file
	public static void run() {
		try {  
			FileOutputStream fout=new FileOutputStream("testout.txt"); 
			
			fout.write('A');  // write takes int (byte) 65  
            
       	 	// not flushing because close will do it. 
      
       	 	fout.close(); 
       	 
            System.out.println("success...");
            
        } catch (IOException e) {  
            System.err.println("Error");  
        }  
	}
	
	// FileOutputStream method write bytes to file
	public static void run2() {
		try {  
			FileOutputStream fout=new FileOutputStream("testout.txt"); 
			String s = "Welcome to COE312";
			byte[] b = s.getBytes();
			fout.write(b);    
            
       	 	// not flushing because close will do it. 
      
       	 	fout.close(); 
       	 
            System.out.println("success...");
            
        } catch (IOException e) {  
            System.err.println("Error");  
        }  
	}
	
	// FileInputStream methods read a bytes 
	public static void run3() {
		try {
			FileInputStream fin = new FileInputStream("testin.txt");
		
			int i = fin.read(); // reads a byte
			
			System.out.print((char) i); // convert it into char. 

			// close the file -- it will also flush (we don't care)
			fin.close();
			
		}catch(IOException e) {
			System.err.println(e);
		}
	}
	
	// FileInputStream methods read bytes
	public static void run4() {
		try {
			FileInputStream fin = new FileInputStream("testin.txt");
			 
			int i = 0;
			// using -1 as an EOF
			while ((i = fin.read()) != -1) {
				System.out.print((char) i);
			}
			
			/*
			boolean eof=false;
			while(!eof) {	
				// if there is at least one byte
				if(fin.available()>0) {
					i=fin.read(); // read it
					if(i==-1) eof=true; // -1 so exit
					System.out.println((char)i ); // print
				}	
			}
			*/
		}catch(IOException e) {
			System.err.println(e);
		}
	}
	
	// FileInputStream methods read bytes
	public static void run5() {
		try {
			FileInputStream fin = new FileInputStream("testin.txt");
			int len = fin.available();
			byte[] data = new byte[len];
			int i = fin.read(data);
			System.out.println("I have read " + len + " bytes");
			
			for (byte b: data) {
				System.out.print((char)b);
			}
			 
			fin.close();
			
		}catch(IOException e) {
			System.err.println(e);
		}
	}
	
}
