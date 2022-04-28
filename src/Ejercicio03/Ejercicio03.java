package Ejercicio03;

import java.util.*;

public class Ejercicio03 {

    public static void main(String[] args) {

        Random rd = new Random();
        int cont = rd.nextInt(10) + 10;
        ArrayList<Integer> nums = new ArrayList<Integer>(cont);

        for (int i = 0; i < cont; i++) {

            nums.add(rd.nextInt(101));
        }

        // Mostrar Array

        System.out.println("Arraylist = " + nums);

        // Suma

        int suma = 0;
        for (int valor : nums) {
            suma += valor;
        }
        System.out.println("Suma = " + suma);

        // Borrar pares y mostrar Lista

        Iterator<Integer> it = nums.iterator();

        while (it.hasNext()) {

            int x = it.next();
            if (x % 2 == 0) {
                it.remove();
            }
        }

        System.out.println("Arraylist sin pares = " + nums);

        // Cambiar divisibles por 3 por un 0

        for (int i = 1; i < nums.size(); i++) {

            if (nums.get(i) % 3 == 0) {
                nums.set(i, 0);
            }
        }

        System.out.println("Arraylist con 0 = " + nums);

        // Si aparece un divisible entre 5, cambiar el anterior por 555

        for (int i = 1; i < nums.size(); i++) {

            if (nums.get(i) % 5 == 0 && nums.get(i) != 0) {
                nums.add(i, 555);
                i++;
            }
        }
        System.out.println("Arraylist con 555 = " + nums);

    }
}
