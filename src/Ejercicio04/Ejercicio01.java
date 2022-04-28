package Ejercicio04;

import java.util.*;

public class Ejercicio01 {

    /*
     * Crea un ArrayList con los nombres de 6 compañeros de clase. A continuación,
     * muestra esos nombres por pantalla. Utiliza para ello un bucle for que recorra
     * todo el ArrayList sin usar ningún índice.
     */
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();

        names.add("Elisa");
        names.add("Guillermo");
        names.add("Diego");
        names.add("Dani");
        names.add("Hector");
        names.add("Gabriel");

        for (String s : names) {

            System.out.println(s);
        }

    }
}
