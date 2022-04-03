package addressbook2;

public class AddressBook {
	public static void main(String[] args) {
		Operations operation = new Operations();
		int choice;
		do {
			System.out.println("Welcome To Address Book");
			System.out.println("\t   MENU");
			System.out.println("---------------------------------------");
			System.out.println("1 : Add New Person \n2 : Display Records \n3 : Exit\n");
			System.out.println("Enter Choice");
			choice = Utility.getIntValue();
			switch (choice) {
			case 1:
				operation.addRecord();
				break;
			case 2:
				operation.displayRecord();
				break;
			case 3:
				System.out.println("BYE");
				break;
			default:
				System.out.println("Enter correct choice");

			}
		} while (choice != 3);
	}
}
