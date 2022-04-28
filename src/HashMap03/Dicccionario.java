package HashMap03;

import java.util.*;

public class Dicccionario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, String> m = new HashMap<>();

        String respuesta = "";
        int correcto = 0;
        int erronero = 0;

        m.put("rio", "river");
        m.put("sonreir", "smile");
        m.put("programa", "program");
        m.put("codigo", "code");
        m.put("contraseña", "password");
        m.put("ordenador", "computer");
        m.put("gato", "cat");
        m.put("rojo", "red");
        m.put("árbol", "tree");
        m.put("pingüino", "penguin");
        m.put("sol", "sun");
        m.put("agua", "water");
        m.put("viento", "wind");

        System.out.println("Introduce la traducción de las siguientes palabras");

        for (Map.Entry dicEntry : m.entrySet()) {
            System.out.print(dicEntry.getKey() + " : ");
            respuesta = sc.nextLine().toLowerCase();
            if (dicEntry.getValue().equals(respuesta)) {

                correcto++;
            } else
                erronero++;
        }

        System.out.println("Correctas = " + correcto);
        System.out.println("Inorrectas = " + erronero);
        sc.close();
    }
}
