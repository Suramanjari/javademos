package LockedMe.com;

public class MenuOptions {
	
	public static void printWelcomeScreen(String appName, String developerName) {
		String companyDetails = String.format("-----Welcome to %s.com. \n" 
								+ "--This application was developed by %s.\n", appName, developerName);
		String appFunction = "--Please be careful to ensure the correct filename is provided.--\n";
		System.out.println(companyDetails);

		System.out.println(appFunction);
	}

	public static void displayMenu() {
		String menu = "\n\n---Select any option---\n\n"
				+ "1) Retrieve all files \"main \"folder \n" 
				+ "2) Display menu\n"
				+ "3) Exit program\n";
		System.out.println(menu);
	}

	public static void displayFileMenuOptions() {
		String fileMenu = "\n\n---Select any option---\n\n"
				+ "1) Add a file to \"main\" folder\n" 
				+ "2) Delete a file from \"main\" folder\n"
				+ "3) Search for a file from \"main\" folder\n" 
				+ "4) Return to Main Menu\n" 
				+ "5) Exit program\n";

		System.out.println(fileMenu);
	}


}
