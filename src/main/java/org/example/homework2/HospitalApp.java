package org.example.homework2;

public class HospitalApp {
    public static void main(String[] args) {
        HospitalApp hospital = new HospitalApp();
        hospital.collectPatienTemp(10);
        hospital.printTemps();
        double avg = hospital.printAverage();
        System.out.println(avg);
        int count = hospital.printHealthy();
        System.out.println(count);
    }

    private double[] pasientTemperatures;

    private void collectPatienTemp(int count) {
        pasientTemperatures = new double[count];
        for (int i = 0; i < count; i++) {
            pasientTemperatures[i] = Math.random() * (40.0 - 36.2) + 36.2;
            System.out.println(pasientTemperatures[i]);
        }
    }

    private void printTemps() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < pasientTemperatures.length; i++) {
            String formattedTemp = String.format("%.1f", pasientTemperatures[i]);
            sb.append(i + 1).append(" - ").append(formattedTemp);
            if (i != pasientTemperatures.length - 1) {
                sb.append(", ");
            }
        }
        System.out.println(sb);
    }

    private double printAverage() {
        double sum = 0.0;
        for (double value : pasientTemperatures) {
            sum += value;
        }
        return sum / pasientTemperatures.length;
    }

    private int printHealthy() {
        int count = 0;
        for (double value : pasientTemperatures) {
            if (value <= 36.9 && value >= 36.2) {
                count++;
            }
        }
        return count;
    }
}
