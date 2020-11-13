package phonebook;

import java.util.ArrayList;

public class PhoneBook {

    private ArrayList<Contact> contacts;

    public PhoneBook() {
        this.contacts = new ArrayList<>();
    }
    
    public void addContact(String name, String phoneNumber) {
        Contact contact = new Contact(name, phoneNumber);
        this.contacts.add(contact);
    }

    public ArrayList<String> getPhoneNumbers(String name) {
        ArrayList<String> phoneNumbersList;
        phoneNumbersList = new ArrayList<>();
        for (int i=0; i < this.contacts.size(); i++) {
            if (this.contacts.get(i).getName() == name) {
                phoneNumbersList.add(this.contacts.get(i).getPhoneNumber());
            }
        }
        return phoneNumbersList;
    }

    public ArrayList<String> getNames(String phoneNumber) {
        ArrayList<String> namesList;
        namesList = new ArrayList<>();
        for (int i=0; i<this.contacts.size(); i++) {
            if (this.contacts.get(i).getPhoneNumber() == phoneNumber) {
                namesList.add(this.contacts.get(i).getName());
            }
        }
        return namesList;
    }
    
}