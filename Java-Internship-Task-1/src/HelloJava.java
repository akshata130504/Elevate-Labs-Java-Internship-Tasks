
public class HelloJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		// Printing a welcome message
        System.out.println("Hello, Java Developer Internship!");

        // Checking and printing command-line arguments
        if (args.length > 0) {
            System.out.println("Command-line arguments received:");
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + (i + 1) + ": " + args[i]);
            }
        } else {
            System.out.println("No command-line arguments were provided.");
        }
	}

}
