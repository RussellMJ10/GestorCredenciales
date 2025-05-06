/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GeneradorCredenciales;

/**
 *
 * @author russe
 */
import java.util.Scanner;

public class Menu {
    public static void iniciar() {
        Scanner sc = new Scanner(System.in);
        GestorEvento gestor = GestorEvento.getInstancia();
        Credencial plantilla = new Credencial("Nombre Apellido", "Asistente", "12345678-9");

        int opcion;
        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Agregar credencial");
            System.out.println("2. Ver credenciales");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Cargo: ");
                    String cargo = sc.nextLine();
                    System.out.print("RUT: ");
                    String rut = sc.nextLine();

                    Credencial nueva = plantilla.clonar();
                    nueva.setNombre(nombre);
                    nueva.setCargo(cargo);
                    nueva.setRut(rut);
                    gestor.agregarCredencial(nueva);
                    System.out.println("✅ Credencial agregada.");
                    break;
                case 2:
                    gestor.listarCredenciales();
                    break;
                case 3:
                    System.out.println("👋 Saliendo...");
                    break;
                default:
                    System.out.println("❌ Opción inválida.");
            }

        } while (opcion != 3);
    }
}

