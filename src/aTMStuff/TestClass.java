package aTMStuff;

import java.util.Scanner;
import java.io.*;

public class TestClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File inputFile = new File("src/aTMStuff/inputFile");
		Scanner input = new Scanner(inputFile);
		ATM2 two = new ATM2();
		String answer = "Hi";
		while(answer == "Hi" && input.hasNext()){
			two.doStuff(input.nextLine());
		}
		two.closeIt();
	}

}
