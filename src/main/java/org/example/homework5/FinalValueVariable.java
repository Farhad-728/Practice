package org.example.homework5;

public class FinalValueVariable {
    public int finalValueAfterOperations(String[] operations) {
        int X = 0;

        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("--XX") || operations[i].equals("XX--")) {
                X--;

            } else {
                X++;
            }
        }
        return X;

    }

    public static void main(String[] args) {
        String[] operations = {"++X","++X","X++"};
        FinalValueVariable finalValue = new FinalValueVariable();
        finalValue.finalValueAfterOperations(operations);
    }
}
