package Ejercicio04;

import java.util.*;

public class Ejercicio02 {

    /*
     * Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
     * ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de
     * esos
     * números. El tamaño de la lista también será aleatorio y podrá oscilar entre
     * 10
     * y 20 elementos ambos inclusive.
     */
    public static void main(String[] args) {

        Random rd = new Random();
        int cont = rd.nextInt(10) + 10;
        ArrayList<Integer> nums = new ArrayList<Integer>(cont);

        // Rellenar la Lista
        for (int i = 0; i < cont; i++) {

            nums.add(rd.nextInt(101));
        }

        System.out.println("ArrayList: " + nums);

        // Calcular la suma,media, min y max
        int suma = 0;
        int max = nums.get(0);
        int min = nums.get(0);

        for (int x : nums) {
            suma += x;
            if (x > max)
                max = x;
            if (x < min)
                min = x;
        }

        System.out.println("Suma del ArrayList: " + suma);

        double media = suma / nums.size();

        System.out.println("Media del ArrayList: " + media);

        System.out.println("Mayor del ArrayList: " + max);
        System.out.println("Menor del ArrayList: " + min);

    }
}
