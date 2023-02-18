
public class ErrorHandling {
	public static void run() {
		try {
			int[] myNumbers = {1, 2, 3};
			System.out.println(myNumbers[10]); // error!
		}catch(Exception e) {
			System.out.println("Some error");
		}
	}
}
