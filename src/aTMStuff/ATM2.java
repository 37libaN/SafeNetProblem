package aTMStuff;

public class ATM2 {
	private int den100, den50, den20, den10, den5, den1;

	public ATM2() {
		den100 = 15;
		den50 = 14;
		den20 = 15;
		den10 = 30;
		den5 = 10;
		den1 = 10;
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
		System.out.println("Machine balance:");
		System.out.println("$100- " + den100);
		System.out.println("$50- " + den50);
		System.out.println("$20- " + den20);
		System.out.println("$10- " + den10);
		System.out.println("$5- " + den5);
		System.out.println("$1- " + den1);
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
			System.out.println(number);
			while (number - 100 >= 0&&den100>0) {
				number -= 100;
				den100--;
			}
			while (number - 50 >= 0&&den50>0) {
				number -= 50;
				den50--;
			}
			while (number - 20 >= 0&&den20>0) {
				number -= 20;
				den20--;
			}
			while (number - 10 >= 0&&den10>0) {
				number -= 10;
				den10--;
			}
			while (number - 5 >= 0&&den5>0) {
				number -= 5;
				den5--;
			}
			while (number - 1 >= 0&&den1>0) {
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
							System.out.println("$100- " + den100);
						if (Integer.parseInt(done1) == 50)
							System.out.println("$50- " + den50);
						if (Integer.parseInt(done1) == 20)
							System.out.println("$20- " + den20);
						if (Integer.parseInt(done1) == 10)
							System.out.println("$10- " + den10);
						if (Integer.parseInt(done1) == 5)
							System.out.println("$5- " + den5);
						if (Integer.parseInt(done1) == 1)
							System.out.println("$1- " + den1);
					}
				}
				if (count == decides.length() - 1) {
					String done1 = decides.substring(indexStartI);
					if (Integer.parseInt(done1) == 100)
						System.out.println("$100- " + den100);
					if (Integer.parseInt(done1) == 50)
						System.out.println("$50- " + den50);
					if (Integer.parseInt(done1) == 20)
						System.out.println("$20- " + den20);
					if (Integer.parseInt(done1) == 10)
						System.out.println("$10- " + den10);
					if (Integer.parseInt(done1) == 5)
						System.out.println("$5- " + den5);
					if (Integer.parseInt(done1) == 1)
						System.out.println("$1- " + den1);
				}
			}
			return "Hi";
		case 'Q':
			System.out.println("Exiting Application");
			return "Done";
		default:
			System.out.println("Failure: Invalid Command");
			return "Hi";
		}
	}

}
