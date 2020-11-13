package phonebook;

import java.util.ArrayList;

public class Demo {

    public static void main (String [] args) {
        PhoneBook annuary = new PhoneBook();
        annuary.addContact("Jean", "06.58.36");
        annuary.addContact("Jean", "17");
        annuary.addContact("Jean", "17");
        System.out.println(annuary.getPhoneNumbers("Jean"));
        System.out.println(annuary.getNames("17"));

    }
}