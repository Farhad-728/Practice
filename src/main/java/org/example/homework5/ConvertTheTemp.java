package org.example.homework5;

public class ConvertTheTemp {

    public double[] convertTempurature(double celsius) {
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.80 + 32.00;
        double[] ans = {kelvin, fahrenheit};
        return ans;
}
        public static void main (String[]args){
            double celsius = 36.50;
            ConvertTheTemp plus = new ConvertTheTemp();
            plus.convertTempurature(celsius);

        }
    }
