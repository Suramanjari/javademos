package LockedMe.com;

public class Main {
public static void main(String[] args) {
		
		FileOperations.createMainFolderIfNotPresent("main");
		
		MenuOptions.printWelcomeScreen("LockedMe", "Suramanjari G G");
		
		HandleOptions.handleWelcomeScreenInput();
	}

}
