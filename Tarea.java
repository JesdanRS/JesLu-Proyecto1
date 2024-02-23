import java.text.SimpleDateFormat;
import java.util.*;

public class Tarea {
    private String nombre;
    private boolean completada;
    private Date fechaLimite;

    public Tarea(String nombre) {
        this.nombre = nombre;
        this.completada = false;
        this.fechaLimite = null;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void marcarComoCompletada() {
        completada = true;
    }

    public void setFechaLimite(Date fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public Date getFechaLimite() {
        return fechaLimite;
    }

    @Override
    public String toString() {
        String estado = completada ? "Completada" : "En curso";
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd yyyy", new Locale("es", "ES"));
        String fechaFormateada = sdf.format(fechaLimite);
        return nombre + " - " + estado + " - Fecha límite: " + fechaFormateada;
    }
}