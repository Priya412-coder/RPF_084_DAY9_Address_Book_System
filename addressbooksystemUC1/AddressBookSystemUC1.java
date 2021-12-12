package addressbooksystemUC1;

public class AddressBookSystemUC1 {
	private static void AddressBook() {
		String  firstName = "Priyanka";
		String lastName = "Singh";
		String address = "Bellandur , Bangalore" ;
		String stateName = "Karnataka";
		String zipCode = " 530030 ";
		String contactNum = " 820933945 ";
		String emailID = "priyankasingh8249@gmail.com";

		System.out.println("Adding following details on address book like" + " " + "firstName :" +firstName+ " lastName :" +lastName+ " address :" +address+ " stateName :" +stateName+ " zipCode :" +zipCode+ " contactNum :" +contactNum+ " emailID :" +emailID );
	}

	public static void main (String[] args) {
		AddressBook();

	}
}
