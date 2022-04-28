package HashMap04;

import java.util.*;

public class Eliza {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, String> map = new HashMap<>();
        boolean encontrado = false;
        boolean fin = false;

        map.put("hola", "Hola, ¿qué tal?");
        map.put("encantado", "Encantado de conocerte yo también");
        map.put("adios", "Adiós, espero volverte a ver pronto");
        map.put("hora", "Lo siento, no llevo reloj");
        map.put("nombre", "Mi nombre es Eliza");

        Set<String> claveStrings = map.keySet();
        ArrayList<String> listofkeys = new ArrayList<>(claveStrings);
        System.out.println("CONEXION CON ELIZA ESTABLECIDA\n");

        while (!fin) {
            System.out.print("You: ");
            String mensaje = sc.nextLine().toLowerCase();

            for (int i = 0; i < listofkeys.size(); i++) {
                if (mensaje.contains(listofkeys.get(i))) {
                    System.out.println("Eliza: " + map.get(listofkeys.get(i)) + "");
                    encontrado = true;
                }
                if (mensaje.toLowerCase().contains("adios")) {
                    fin = true;
                }
            }
            if (!encontrado) {
                System.out.println("Eliza : Lo siento no te he entendido");
            }

        }
        System.out.println("\nFIN DE LA CONEXION");

        sc.close();
    }
}
