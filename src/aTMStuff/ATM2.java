package aTMStuff;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class ATM2 {
	private int den100, den50, den20, den10, den5, den1;
	private File outputFile;
	private FileOutputStream outputStream;
	private PrintWriter output;

	public ATM2() throws FileNotFoundException {
		den100 = 15;
		den50 = 14;
		den20 = 15;
		den10 = 30;
		den5 = 10;
		den1 = 10;
		outputFile = new File("src/aTMStuff/outputFile");
		outputStream = new FileOutputStream(outputFile);
		output = new PrintWriter(outputStream);
		/*
		 * balance =
		 * (den100*100)+(den50*50)+(den20*20)+(den10*10)+(den5*5)+(den1*1);
		 */
	}
	/*
	 * public void setDenoms() { int newBalance = balance; while (newBalance -
	 * 100 >= 0) { newBalance -= 100; den100++; } while (newBalance - 50 >= 0) {
	 * newBalance -= 50; den50++; } while (newBalance - 20 >= 0) { newBalance -=
	 * 20; den20++; } while (newBalance - 10 >= 0) { newBalance -= 10; den10++;
	 * } while (newBalance - 5 >= 0) { newBalance -= 5; den5++; } while
	 * (newBalance - 1 >= 0) { newBalance -= 1; den1++; } if (newBalance != 0)
	 * System.out.println("uh-oh"); }
	 */

	public void outputBalance() {
		output.println("Machine balance:");
		output.println("$100- " + den100);
		output.println("$50- " + den50);
		output.println("$20- " + den20);
		output.println("$10- " + den10);
		output.println("$5- " + den5);
		output.println("$1- " + den1);
	}

	public String doStuff(String decides) {

		switch (decides.charAt(0)) {
		case 'R':
			den100 = 10;
			den50 = 10;
			den20 = 10;
			den10 = 10;
			den5 = 10;
			den1 = 10;
			outputBalance();
			return "Hi";
		case 'W':
			int indexStart = 0;
			int indexEnd = 0;
			for (int count = 0; count < decides.length(); count++) {
				if (decides.charAt(count) == '1' || decides.charAt(count) == '2') {
					if (indexStart == 0)
						indexStart = count;
					else
						indexEnd = count + 1;
				}
				if (decides.charAt(count) == '3' || decides.charAt(count) == '4') {
					if (indexStart == 0)
						indexStart = count;
					else
						indexEnd = count + 1;
				}
				if (decides.charAt(count) == '5' || decides.charAt(count) == '6') {
					if (indexStart == 0)
						indexStart = count;
					else
						indexEnd = count + 1;
				}
				if (decides.charAt(count) == '7' || decides.charAt(count) == '8') {
					if (indexStart == 0)
						indexStart = count;
					else
						indexEnd = count + 1;
				}
				if (decides.charAt(count) == '9') {
					if (indexStart == 0)
						indexStart = count;
					else
						indexEnd = count + 1;
				}
			}
			String numberWord = decides.substring(indexStart, indexEnd);
			int number = Integer.parseInt(numberWord);
			output.println(number);
			while (number - 100 >= 0 && den100 > 0) {
				number -= 100;
				den100--;
			}
			while (number - 50 >= 0 && den50 > 0) {
				number -= 50;
				den50--;
			}
			while (number - 20 >= 0 && den20 > 0) {
				number -= 20;
				den20--;
			}
			while (number - 10 >= 0 && den10 > 0) {
				number -= 10;
				den10--;
			}
			while (number - 5 >= 0 && den5 > 0) {
				number -= 5;
				den5--;
			}
			while (number - 1 >= 0 && den1 > 0) {
				number -= 1;
				den1--;
			}
			outputBalance();
			return "Hi";
		case 'I':
			int indexStartI = 0;
			int indexEndI = 0;
			for (int count = 0; count < decides.length(); count++) {
				if (decides.charAt(count) == '$') {
					indexStartI = count + 1;
				}
				if (decides.charAt(count) == ' ') {
					if (indexStartI != 0) {
						indexEndI = count;
						String done1 = decides.substring(indexStartI, indexEndI);
						if (Integer.parseInt(done1) == 100)
							output.println("$100- " + den100);
						if (Integer.parseInt(done1) == 50)
							output.println("$50- " + den50);
						if (Integer.parseInt(done1) == 20)
							output.println("$20- " + den20);
						if (Integer.parseInt(done1) == 10)
							output.println("$10- " + den10);
						if (Integer.parseInt(done1) == 5)
							output.println("$5- " + den5);
						if (Integer.parseInt(done1) == 1)
							output.println("$1- " + den1);
					}
				}
				if (count == decides.length() - 1) {
					String done1 = decides.substring(indexStartI);
					if (Integer.parseInt(done1) == 100)
						output.println("$100- " + den100);
					if (Integer.parseInt(done1) == 50)
						output.println("$50- " + den50);
					if (Integer.parseInt(done1) == 20)
						output.println("$20- " + den20);
					if (Integer.parseInt(done1) == 10)
						output.println("$10- " + den10);
					if (Integer.parseInt(done1) == 5)
						output.println("$5- " + den5);
					if (Integer.parseInt(done1) == 1)
						output.println("$1- " + den1);
				}
			}
			return "Hi";
		case 'Q':
			output.println("Exiting Application");
			return "Done";
		default:
			output.println("Failure: Invalid Command");
			return "Hi";
		}
	}
	public void closeIt(){
		output.close();
	}
}
