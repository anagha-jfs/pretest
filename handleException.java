package exception_handling;

public class handleException {
	public static void main(String[] args) {
		//adding try catch block to not show the exception message
		try {
		int i = 100;
		System.out.println("Dividing by zero");
		int result = i/0;
		System.out.println("Does not execute");
		System.out.println(result);
		}
		catch(Exception exception) {
			System.out.println("out of order, please try again after sometime.");
			return;
		}
	}
}