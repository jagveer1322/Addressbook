package addressbook2;

import java.util.Scanner;

public class Utility {
	public static final Scanner scan = new Scanner(System.in);

	public static int getIntValue() {
		return scan.nextInt();
	}

	public static String getStringValue() {
		return scan.next();

	}

}
