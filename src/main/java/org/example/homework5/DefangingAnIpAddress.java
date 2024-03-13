package org.example.homework5;

public class DefangingAnIpAddress {
    public String defangIPaddr(String address)  {
        return address.replace(".", "[.]");
    }

    public static void main(String[] args) {
        String address = "255.100.50.0";
        DefangingAnIpAddress ip = new DefangingAnIpAddress();
        System.out.println(ip.defangIPaddr(address));
    }
}
