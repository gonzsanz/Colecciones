package Ejercicio04;

import java.util.*;

public class Ejercicio04 {

    /*
     * Realiza un programa equivalente al anterior pero en esta ocasión, el programa
     * debe ordenar palabras en lugar de números.
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> nums = new ArrayList<String>();

        System.out.println("Introduce 10 palabras");
        for (int i = 0; i < 10; i++) {
            nums.add(sc.nextLine());
        }

        Collections.sort(nums);

        System.out.println(nums);

        sc.close();
    }
}
