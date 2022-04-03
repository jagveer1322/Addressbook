package addressbook2;

public class AddressBook {
	public static void main(String[] args) {
		System.out.println("Welcome To Address Book");

		String fname, lname, address, city, state, zip, phone;

		System.out.println("Enter First Name");
		fname = Utility.getStringValue();
		System.out.println("Enter Last Name");
		lname = Utility.getStringValue();
		System.out.println("Enter Address");
		address = Utility.getStringValue();
		System.out.println("Enter City");
		city = Utility.getStringValue();
		System.out.println("Enter State");
		state = Utility.getStringValue();
		System.out.println("Enter Zip");
		zip = Utility.getStringValue();
		System.out.println("Enter phone number");
		phone = Utility.getStringValue();
	}
}
