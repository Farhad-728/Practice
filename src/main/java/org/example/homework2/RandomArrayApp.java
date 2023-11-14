package org.example.homework2;


public class RandomArrayApp {
    public static void main(String[] args) {
        int length = 10;
        int[] ticketNums = new int[length];

        for (int i = 0; i < ticketNums.length; i++) {
            ticketNums[i] = (int) (Math.random() * 101);
        }

        int[] winnerTickets = new int[length/2];
        for (int i = 1; i < winnerTickets.length; i++) {
            if (i % 2 == 0) {
                winnerTickets[i] = ticketNums[i];
            }
        }

        for (int value1 : ticketNums) {
            System.out.print(value1 + " ");
        }
        System.out.println();
        for (int value2 : winnerTickets) {
            System.out.print(value2 + " ");
        }
    }
}
