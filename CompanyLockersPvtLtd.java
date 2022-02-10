package com.Mphasis;

public class CompanyLockersPvtLtd {

	public static void main(String[] args) {
		
		Operationswithfile.createMainFolderIfNotPresent("main");
		
		Options.printWelcomeScreen("Company Lockers Private limited", "Logesh");
		
		ControlOptions.handleWelcomeScreenInput();
	}

	
}
