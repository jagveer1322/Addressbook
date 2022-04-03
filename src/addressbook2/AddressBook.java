package addressbook2;

public class AddressBook {
	public static void main(String[] args) {
		Operations operation = new Operations();
		int choice;
		do {
			System.out.println("Welcome To Address Book");
			System.out.println("\t   MENU");
			System.out.println("---------------------------------------");
			System.out.println("1 : DISPLAY RECORDS \n2 : ADD  PERSON \n3 : EDIT PERSON \n4 : EXIT\n");
			System.out.println("Enter Choice");
			choice = Utility.getIntValue();
			switch (choice) {
			case 1:
				operation.displayRecord();
				break;
			case 2:
				operation.addRecord();

				break;
			case 3:
				operation.editRecord();
				break;
			case 4:
				System.out.println("BYE");
				break;
			default:
				System.out.println("Enter correct choice");

			}
		} while (choice != 4);
	}
}
