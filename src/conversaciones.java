import java.util.HashMap;
import javax.swing.JTextArea;


public class conversaciones {
 private HashMap <String,String> personasconversaciones;
 private HashMap <String, JTextArea> conversacion;

 
 
 
    public HashMap<String, String> getPersonasconversaciones() {
        return personasconversaciones;
    }

    public void setPersonasconversaciones(HashMap<String, String> personasconversaciones) {
        this.personasconversaciones = personasconversaciones;
    }

    public HashMap<String, JTextArea> getConversacion() {
        return conversacion;
    }

    public void setConversacion(HashMap<String, JTextArea> conversacion) {
        this.conversacion = conversacion;
    }
 
 
}
