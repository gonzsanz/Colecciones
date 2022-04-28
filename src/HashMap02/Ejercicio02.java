package HashMap02;

import java.util.*;

public class Ejercicio02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<String, String> m = new HashMap<String, String>();

        String pswd;
        String user;
        int cont = 3;
        boolean correcto = false;

        m.put("admin", "admin");
        m.put("usuario1", "1234");
        m.put("usuario2", "1234");
        m.put("usuario3", "1234");
        m.put("usuario4", "1234");
        m.put("usuario5", "1234");

        do {
            System.out.println("\nIntroduzca su usuario y contraseña, dispone de " + cont + " oportunidades");
            System.out.print("Usuario: ");
            user = sc.nextLine();
            System.out.print("Contraseña: ");
            pswd = sc.nextLine();

            if (m.containsKey(user)) {

                if (m.get(user).equals(pswd)) {

                    correcto = true;
                    System.out.println("\nHa accedido al área restringida");
                }
                if (cont > 1 && !correcto) {
                    System.err.println("\nVuelva a intentarlo");
                }
                cont--;

            } else {
                System.out.println("Usuario o contraseñas incorrectas");
                cont--;

            }

            if (cont == 0) {
                System.out.println("\nLo siento, no tiene acceso al área restringidad");
            }
        } while (!correcto && cont > 0);

        sc.close();
    }

}
