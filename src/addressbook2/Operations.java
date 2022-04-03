package addressbook2;

import java.util.ArrayList;
import java.util.List;

public class Operations {
	List<Person> person = new ArrayList<Person>();

	// Add method
	public void addRecord() {
		String firstName, lastName, address, city, state, zip, phone;

		System.out.println("Enter First Name :");
		firstName = Utility.getStringValue();
		System.out.println("Enter Last Name :");
		lastName = Utility.getStringValue();
		System.out.println("Enter Address :");
		address = Utility.getStringValue();
		System.out.println("Enter City :");
		city = Utility.getStringValue();
		System.out.println("Enter State :");
		state = Utility.getStringValue();
		System.out.println("Enter Zip :");
		zip = Utility.getStringValue();
		System.out.println("Enter phone number :");
		phone = Utility.getStringValue();
		person.add(new Person(firstName, lastName, address, city, state, zip, phone));
	}

	// Display Method
	public void displayRecord() {
		for (Person show : person) {
			System.out.println(show);
		}
	}
}
