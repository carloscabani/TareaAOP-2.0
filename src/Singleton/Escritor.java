

import java.util.*;

public class Escritor {
    private static Escritor instancia;
    private List<String> logMessages;

    // Constructor privado para evitar la creación de instancias desde fuera de la clase
    private Escritor() {
        logMessages = new ArrayList<>();
    }

    // Método estático para obtener la instancia única de Escritor
    public static Escritor getInstance() {
        if (instancia == null) {
        	instancia = new Escritor();
        }
        return instancia;
    }

    // Método para agregar un mensaje al registro
    public void log(String message) {
        logMessages.add(message);
    }

    // Método para obtener todos los mensajes registrados
    public List<String> getLogMessages() {
        return logMessages;
    }
}

