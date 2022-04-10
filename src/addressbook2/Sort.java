package addressbook2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {
	public static void searchByCity(List<Person> person) {
		String search;
		List<Person> matches = new ArrayList<>();
		System.out.println("Enter First Name to search : ");
		search = Utility.getStringValue();
		int flag = 0;
		for (Person p : person) {
			if (p.getCity().equalsIgnoreCase(search)) {
				flag = 1;
				matches.add(p);
			}
		}
		if (flag == 1) {
			System.out.println("...Match Found...");
			for (Person p : matches) {
				System.out.println(p);
			}
		} else {
			System.out.println("Match Not Found!!!");
		}
	}

	public static void searchByState(List<Person> person) {
		String search;
		int flag = 0;
		List<Person> matches = new ArrayList<>();
		System.out.println("Enter First Name to search : ");
		search = Utility.getStringValue();
		for (Person p : person) {
			if (p.getState().equalsIgnoreCase(search)) {
				flag = 1;
				matches.add(p);
			}
		}
		if (flag == 1) {
			System.out.println("...Match Found...");
			for (Person p : matches) {
				System.out.println(p);
			}
		} else {
			System.out.println("Match Not Found!!!");
		}
	}

	public static void sortByName(List<Person> person) {
		Collections.sort(person, Person.firstNameSorting);
		for (Person p : person) {
			System.out.println(p);
		}
	}

	public static void sortByCity(List<Person> person) {
		Collections.sort(person, Person.citySorting);
		for (Person p : person) {
			System.out.println(p);
		}
	}

	public static void sortByState(List<Person> person) {
		Collections.sort(person, Person.stateSorting);
		for (Person p : person) {
			System.out.println(p);
		}
	}

	public static void sortByZip(List<Person> person) {
		Collections.sort(person, Person.zipSorting);
		for (Person p : person) {
			System.out.println(p);
		}
	}
}