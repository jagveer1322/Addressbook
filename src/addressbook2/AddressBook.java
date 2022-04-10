package addressbook2;

public class AddressBook {
	public static void main(String[] args) throws AddressBookException {
		Operations operation = new Operations();
		int choice;
		do {
			System.out.println("Welcome To Address Book");
			System.out.println("\t   MENU  ");
			System.out.println("---------------------------------------");
			System.out.println(
					"1 : DISPLAY RECORDS \n2 : ADD  PERSON \n3 : EDIT PERSON \n4 : DELETE RECORD \n5 : SORT RECORDS \n6 : Person By City and State \n7 : Search \n8 : Exit");
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
				operation.deleteRecord();
				break;
			case 5:
				operation.sortRecords();
				break;
			case 6:
				operation.viewByCityAndState();
				break;
			case 7:
				operation.searchByCityState();
				break;
			case 8:
				System.out.println("BYE");
				break;
			default:
				System.out.println("Enter correct choice");

			}
		} while (choice != 7);
	}
}
