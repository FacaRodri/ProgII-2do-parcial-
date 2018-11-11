import java.time.LocalDate;
import java.util.ArrayList;

public class Notificacion{
	ArrayList <String> palabras;
	Empleado remitente;
	LocalDate fecha;
	
	public int cantPalabaras() {
		return palabras.size();
	}
	public boolean contiene (String s) {
		return palabras.contains(s);
	}
}
