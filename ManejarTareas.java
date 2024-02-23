import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ManejarTareas {
    public Scanner scanner = new Scanner(System.in);
    public void agregarTarea(ArrayList<Tarea> listaTareas) {
        System.out.print("Ingrese el nombre de la nueva tarea: ");
        String nombreTarea = scanner.nextLine();
        Tarea nuevaTarea = new Tarea(nombreTarea);
        System.out.print("Ingrese la fecha límite (Formato: dd/MM/yyyy): ");
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaLimite = null;
        boolean fechaValida = false;
        do {
            String fechaString = scanner.next();
            try {
                fechaLimite = dateFormat.parse(fechaString);
                fechaValida = true;
            } catch (ParseException e) {
                System.out.println("FORMATO DE FECHA INVÁLIDO.");
                System.out.println("Inténtelo de nuevo (Formato: dd/MM/yyyy): ");
            }
        } while (!fechaValida);
        nuevaTarea.setFechaLimite(fechaLimite);
        listaTareas.add(nuevaTarea);
        System.out.println("TAREA AGREGADA CORRECTAMENTE.");
    }


    public void marcarTareaCompletada(ArrayList<Tarea> listaTareas) {
        System.out.println("LISTA DE TAREAS");
        int c = 1;
        for (Tarea tarea : listaTareas) {
            if (!tarea.isCompletada()){
                System.out.println(c + "\t" + tarea);
                c++;
            }
        }
        System.out.print("Ingrese el índice de la tarea a marcar como completada: ");
        int indice = scanner.nextInt();
        int i = indice - 1;
        if (i >= 0 && i < listaTareas.size()) {
            listaTareas.get(i).marcarComoCompletada();
            System.out.println("TAREA MARCADA COMO COMPLETADA.");
        } else {
            System.out.println("ÍNDICE NO VÁLIDO.");
        }
    }

    public void eliminarTarea(ArrayList<Tarea> listaTareas) {
        System.out.println("LISTA DE TAREAS");
        int c = 1;
        for (Tarea tarea : listaTareas) {
            System.out.println(c + "\t" + tarea);
            c++;
        }
        System.out.print("Ingrese el índice de la tarea a eliminar: ");
        int indice = scanner.nextInt();
        int i = indice - 1;
        if (i >= 0 && i < listaTareas.size()) {
            listaTareas.remove(indice-1);
            System.out.println("TAREA ELIMINADA CON ÉXITO.");
        } else {
            System.out.println("ÍNDICE DE TAREA NO VÁLIDO.");
        }
    }

    public void generarReporte(ArrayList<Tarea> listaTareas) {
        System.out.println("-- REPORTE DE TAREAS --");
        System.out.println("EN CURSO:");
        for (Tarea tarea : listaTareas) {
            if (!tarea.isCompletada()) {
                System.out.println(tarea);
            }
        }
        System.out.println("COMPLETADAS:");
        for (Tarea tarea : listaTareas) {
            if (tarea.isCompletada()) {
                System.out.println(tarea);
            }
        }
    }
}
