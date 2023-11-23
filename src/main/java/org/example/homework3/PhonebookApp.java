package org.example.homework3;

import java.util.HashMap;
import java.util.Map;

public class PhonebookApp {
    public static void main(String[] args) {
        PhonebookApp pb = new PhonebookApp();
        pb.addContacts();
        pb.removeContacts();
        System.out.println("Contacts found:" + " " + pb.findContacts());
        pb.printContacts();

    }

    HashMap<String, Integer> contacts = new HashMap<>(30);

    private void addContacts() {
        contacts.put("Samir", 505050500);
        contacts.put("Farhad", 502000000);
        contacts.put("Ilgar", 512100000);
        contacts.put("Nizami", 502690000);
        contacts.put("Murad", 552356161);
        contacts.put("Orkhan", 552356282);
    }

    private void removeContacts() {
        contacts.remove("Nizami");
    }

    private boolean findContacts() {
        if (contacts.containsKey("Qara")) {
            return true;
        } else {
            return false;
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