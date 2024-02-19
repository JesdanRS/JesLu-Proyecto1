import java.util.ArrayList;
import java.util.Scanner;

public class MenuTareas {
    private Scanner scanner;

    public MenuTareas() {
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\n-- Menú de Tareas --");
            System.out.println("1. Agregar nueva tarea");
            System.out.println("2. Marcar tarea como completada");
            System.out.println("3. Eliminar tarea de la lista");
            System.out.println("4. Generar reporte de tareas");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Aquí va agregar tareas");
                    break;
                case 2:
                    System.out.println("Aquí va marcar como completado");
                    break;
                case 3:
                    System.out.println("Aquí va eliminar tarea");
                    break;
                case 4:
                    System.out.println("Aquí va generar reportes de tareas");
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
                    break;
            }
        } while (opcion != 5);
    }

    public static void main(String[] args) {
        MenuTareas menu = new MenuTareas();
        menu.mostrarMenu();
    }
}