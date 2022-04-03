package addressbook2;

public class Person {

	private String firstName, lastName, address, city, state, zip, phone;

	public Person(String firstName, String lastName, String address, String city, String state, String zip,
			String phone) {
		super();

		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone = phone;
	}

	public Person() {
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		System.out.println(" \t  UPDATED LIST ");
		System.out.println("----------------------------------------------");
		return " firstName = " + firstName + "\n lastName = " + lastName + "\n address = " + address + "\n city = "
				+ city + "\n state = " + state + "\n zip = " + zip + "\n phone = " + phone;
	}

}