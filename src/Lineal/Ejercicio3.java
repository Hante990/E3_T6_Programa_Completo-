/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lineal;

/**
 *
 * @author alons
 */
public class Ejercicio3 {
public static double interpolate(double[] x, double[] y, double xTarget) {
        int n = x.length;
        double yTarget = 0;

        int i = 0;
        while (i < n - 1 && x[i] < xTarget) {
            i++;
        }

        if (i == 0) {
            yTarget = y[0];
        } else if (i == n - 1) {
            yTarget = y[n - 1];
        } else {
            double x0 = x[i - 1];
            double x1 = x[i];
            double y0 = y[i - 1];
            double y1 = y[i];

            double m = (y1 - y0) / (x1 - x0);
            double b = y0 - m * x0;
            yTarget = m * xTarget + b;
        }

        return yTarget;
    }

 public static void main(String[] args) {
    double[] x = {1.2, 2.4, 3.6, 4.8, 6.0};
    double[] y = {1.5, 3.5, 5.5, 7.5, 9.5};
    double xTarget = 4.2;
    double yTarget = interpolate(x, y, xTarget);
    System.out.println("El valor de y para x = " + xTarget + " es " + yTarget);
}
}

