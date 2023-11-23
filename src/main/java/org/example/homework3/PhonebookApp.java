package org.example.homework3;

import java.util.HashMap;
import java.util.Map;

public class PhonebookApp {
    public static void main(String[] args) {
        PhonebookApp pb = new PhonebookApp();
        pb.addContacts("Samir", 505992688);
        pb.addContacts("Farhad", 507287282);
        pb.addContacts("Nizami", 504510052);
        pb.addContacts("Orkhan", 512356185);
        pb.addContacts("Murad", 512356181);
        pb.removeContacts("Nizami");
        pb.findContacts("Samir");
        pb.printContacts();

    }

    HashMap<String, Integer> contacts = new HashMap<>(30);

    private void addContacts(String name, int number) {
        contacts.put(name, number);
    }

    private void removeContacts(String name) {
        contacts.remove(name);
    }

    private void findContacts(String name) {
        if (contacts.containsKey(name)) {
            System.out.println("Contact found: " + " " + contacts.get(name));
        } else {
            System.out.println("Contact not found");
        }
    }
    private void printContacts() {

        for (Map.Entry<String, Integer> contact : contacts.entrySet()) {
            String key = contact.getKey();
            Integer value = contact.getValue();
            System.out.println(key + " " + value);
        }
    }
}