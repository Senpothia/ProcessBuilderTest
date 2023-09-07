package processBuilderTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ProcessBuilderExample1 {

	public static void main(String[] args) throws IOException {
		
		/*
		ProcessBuilder processBuilder = new ProcessBuilder();
		
		processBuilder.command("cmd.exe", "/c", "dir C:\\Program Files\\Notepad++");
		processBuilder.command("C:\\Program Files\\Notepad++\\notepad++.exe");
		processBuilder.directory(new File("C:\\"));
		
		Process process = processBuilder.start();
		
		*/
		
		/*
		Runtime runtime = Runtime.getRuntime();
		Process process = runtime.exec("notepad.exe C:\\bonjour.txt");
		*/
		
		
		Runtime runtime = Runtime.getRuntime();
		Process process = runtime.exec("STM32_Programmer_CLI.exe -c port=SWD -w C:\\Users\\michel\\Downloads\\Bluegriot_2023-08-31\\Livrable\\BLE_Custom_deliverable8.hex 0x08000000");
		//Process process = runtime.exec("STM32_Programmer_CLI.exe -c port=SWD -e all");
		System.out.println("FIN");
		
		
	}

}
