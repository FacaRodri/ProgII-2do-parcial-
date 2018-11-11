import java.util.*;

public class Empleado extends Usuario {
	
	ArrayList <Notificacion> notificaciones;
	String apellido;
	int nroLegajo;
	
	public void recibirNoti(Notificacion n, LimiteNotificaciones l) {
		if (l.limite(n)) {
		notificaciones.add(n);
		}	
	}
	public int getNroLegajo() {
		return this.nroLegajo;
	}
	public int CantEmpleados() {
		return 1;
	}
	
	public HashSet<Empleado> listarEmpleado() {
		HashSet <Empleado> aux = new HashSet<>();
		aux.add(this);
		return aux;
	}
	public boolean equals(Object o) {
		Empleado e = (Empleado)o;
		return this.getNroLegajo() == e.getNroLegajo();
	}
	
	public int cantMensajes() {
		return notificaciones.size();
	}
	
	
	

}
