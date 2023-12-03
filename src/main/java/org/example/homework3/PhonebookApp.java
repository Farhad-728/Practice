package org.example.homework3;

import java.util.HashMap;
import java.util.Map;

public class PhonebookApp {
    public static void main(String[] args) {
        PhonebookApp pb = new PhonebookApp();
        pb.addContact("Samir", 505992688);
        pb.addContact("Farhad", 507287282);
        pb.addContact("Nizami", 504510052);
        pb.addContact("Orkhan", 512356185);
        pb.addContact("Murad", 512356181);
        pb.removeContact("Nizami");
        pb.findContact("Samir");
        pb.printContacts();

    }

    HashMap<String, Integer> contacts = new HashMap<>(30);

    private void addContact(String name, int number) {
        contacts.put(name, number);
    }

    private void removeContact(String name) {
        contacts.remove(name);
    }

    private void findContact(String name) {
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