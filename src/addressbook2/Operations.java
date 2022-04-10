package addressbook2;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

public class Operations {
	List<Person> personList = new ArrayList<Person>();

	// Add method
	public void addRecord() {

		int i = 0;
		String firstName, lastName, address, city, state, zip, phone;
		while (i == 0) {
			System.out.print("Enter First Name : ");
			firstName = Utility.getStringValue();
			if (checkExists(firstName)) {
				System.out.println("Person Name Already Exists!!\nPlease enter different name...");
			} else {
				i = 1;
			}
		}

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
		personList.add(new Person(firstName, lastName, address, city, state, zip, phone));
	}

	// Display Method
	public void displayRecord() {
		if (personList.isEmpty()) {
			System.out.println("No records found");

		} else {

			for (Person show : personList) {
				System.out.println(show);
			}
		}
	}

	public void editRecord() throws AddressBookException {
		int id, i = 0;
		String address, city, state, phone, zip;
		try {
			if (personList.isEmpty()) {
				System.out.println("No Records To Edit!!!");
			} else {
				for (Person person : personList) {
					System.out.println("ID: #" + personList.indexOf(person) + " : " + person);
				}
				System.out.print("\nEnter #ID to Edit Contact : ");
				id = Utility.getIntValue();
				System.out.println(personList.get(id));
				while (i == 0) {
					System.out.println("What You Want to edit...\n" + "\t1: Address\n" + "\t2: city\n" + "\t3: State\n"
							+ "\t4: Phone\n" + "\t5: Zip Code\n" + "\t6. Save And Exit\n");
					int choice = Utility.getIntValue();
					switch (choice) {
					case 1:
						System.out.print("Enter new Address : ");
						address = Utility.getStringValue();
						personList.get(id).setAddress(address);
						break;
					case 2:
						System.out.print("Enter new City : ");
						city = Utility.getStringValue();
						personList.get(id).setCity(city);
						break;
					case 3:
						System.out.print("Enter new State : ");
						state = Utility.getStringValue();
						personList.get(id).setState(state);
						break;
					case 4:
						System.out.print("Enter new Phone : ");
						phone = Utility.getStringValue();
						personList.get(id).setPhone(phone);
						break;
					case 5:
						System.out.print("Enter new Zip Code : ");
						zip = Utility.getStringValue();
						personList.get(id).setZip(zip);
						break;
					case 6:
						i = 1;
						break;
					default:
						System.out.println("Please Enter Valid Option");
					}
					System.out.println(personList.get(id));
				}
			}
		} catch (IndexOutOfBoundsException e) {
			throw new AddressBookException("Entered Wrong #ID", AddressBookException.exceptionType.ENTERED_WRONG_ID);
		}

	}

	public void deleteRecord() {
		int id;
		for (Person show : personList) {
			System.out.println("ID: #" + personList.indexOf(show) + " : " + show);
		}
		System.out.print("\nEnter #ID to delete Contact : ");
		id = Utility.getIntValue();
		personList.remove(id);
	}

	public boolean checkExists(String firstName) {
		int flag = 0;
		for (Person p : personList) {
			if (p.getFirstName().equals(firstName)) {
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			return true;
		}
		return false;
	}

	public void sortRecords() {
		System.out
				.println("Sort By...\n" + "1: First Name\n" + "2: City\n" + "3: State\n" + "4: Zip Code\n" + "5: Back");
		int choice = Utility.getIntValue();
		switch (choice) {
		case 1:
			Sort.sortByName(personList);
			break;
		case 2:
			Sort.sortByZip(personList);
			break;
		case 3:
			Sort.sortByState(personList);
			break;
		case 4:
			Sort.sortByZip(personList);
			break;
		case 5:
			return;
		default:
			System.out.println("Please Enter Valid Option...");
		}
	}

	public void searchByCityState() {
		int choice = 0;
		System.out.println("Search By\n" + "1: City\n" + "2: State\n" + "3: back");
		choice = Utility.getIntValue();
		switch (choice) {
		case 1:
			Search.searchByCity(personList);
			break;
		case 2:
			break;
		case 3:
			return;
		default:
			System.out.println("Enter Valid Option");
		}
	}

	// This Method will View Person by City and State
	public void viewByCityAndState() {
		Dictionary<String, String> cityDict = createCityDict();
		Dictionary<String, String> stateDict = createStateDict();
		final String city, state;
		System.out.println("Enter City");
		city = Utility.getStringValue();
		System.out.println("Enter State");
		state = Utility.getStringValue();
		Search.searchByCityAndState(cityDict, stateDict);
	} // End of viewByCityAndState() Method

//	    Create City Dictionary
	public Dictionary<String, String> createCityDict() {
		Dictionary<String, String> cityDict = new Hashtable<String, String>();
		for (Person person : personList) {
			cityDict.put(person.getFirstName(), person.getCity());
		}
		return cityDict;
	}

//	    Create State Dictionary
	public Dictionary<String, String> createStateDict() {
		Dictionary<String, String> stateDict = new Hashtable<String, String>();
		for (Person person : personList) {
			stateDict.put(person.getFirstName(), person.getState());
		}
		return stateDict;
	}

}
