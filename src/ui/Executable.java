package ui;

import java.util.Scanner;
import model.Controladora;

public class Executable {

    private Scanner reader;
    private Controladora cont;
    private static boolean flag;

    private Executable() {
        reader = new Scanner(System.in);
        cont = new Controladora();
    }

    public void run(boolean flag) {
        flag = false;
        while (!flag) {
            System.out.println("\n\nBienvenido al menu de agro plataforma TuPlaza:\n");
            System.out.println("Opciones:");
            System.out.println("1. Registrar producto");
            System.out.println("2. Procesar pedido");
            System.out.println("3. Salir");

            int option = reader.nextInt();
            reader.nextLine();

            switch (option) {
                case 1:
                    registrarProducto();
                    break;
                case 2:
                    procesarPedido();
                    break;
                case 3:
                    flag = true;
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Por favor ingrese una opcion valida");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Executable app = new Executable();
        app.run(flag);
    }

    public void registrarProducto() {
        // TODO: implementar registro de producto llamando a métodos de Controladora
    }

    public void procesarPedido() {
        // TODO: implementar procesamiento de pedido llamando a métodos de Controladora
    }
}