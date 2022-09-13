package lr;

import java.util.Arrays;

/**
 * Лабораторная работа №1
 * @author Platonova Alexandra
 */
public class Main {
    public static void main(String[] args) {
        int dSize = 11;
        int xSize = 10;
        int[] d = new int[dSize];
        float[] x = new float[xSize];
        double[][] c = new double[dSize][xSize];

        for (int i = 0, val = 3; i < dSize; i++, val+=2) {
            d[i] = val;
        }

        for (int i = 0; i < xSize; i++) {
            float var = (float) Math.random() * 15;
            if (var<=10) {
                float sign = (float) Math.random();
                if (sign >= 0.5f) {
                    x[i] = var;
                } else {
                    x[i] = -var;
                }
            } else {
                x[i] = var;
            }
        }

        for (int i = 0; i < dSize; i++) {
            for (int j = 0; j < xSize; j++) {
                c[i][j] = calculation(d[i], x[j]);
                System.out.printf("%.2f \t", c[i][j]);
            }
            System.out.println();
        }


    }

    public static double calculation(int dElement, float xElement) {
        return switch (dElement) {
            case 3 ->  Math.cbrt(Math.atan(1/Math.pow(Math.E, Math.abs(xElement))));
            case 7, 9, 11, 13, 19 -> Math.sin(Math.log(Math.pow(Math.E, xElement)));
            default -> Math.atan(Math.pow(Math.pow(Math.E, Math.cbrt(Math.pow(-Math.E, xElement))), 2)); //возведение отрицательного числа в дробную степень дает NaN
        };
    }
}
