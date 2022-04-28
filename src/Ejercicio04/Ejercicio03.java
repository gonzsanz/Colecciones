package Ejercicio04;

import java.util.*;

public class Ejercicio03 {

    /*
     * Escribe un programa que ordene 10 números enteros introducidos por teclado
     * y almacenados en un objeto de la clase ArrayList.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> nums = new ArrayList<Integer>();

        System.out.println("Introduce 10 numeros");
        for (int i = 0; i < 10; i++) {
            nums.add(sc.nextInt());
        }

        Collections.sort(nums);

        System.out.println(nums);

        sc.close();
    }

}
