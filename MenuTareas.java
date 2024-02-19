import java.util.ArrayList;
import java.util.Scanner;

public class MenuTareas {
    private Scanner scanner;
    private ArrayList<Tarea> listaTareas;
    public MenuTareas() {
        listaTareas = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcion;
        ManejarTareas nt = new ManejarTareas();
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
                    nt.agregarTarea(listaTareas);
                    break;
                case 2:
                    nt.marcarTareaCompletada(listaTareas);
                    break;
                case 3:
                    nt.eliminarTarea(listaTareas);
                    break;
                case 4:
                    nt.generarReporte(listaTareas);
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
