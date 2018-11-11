import java.util.*;

public abstract class Usuario {
	
	String nombre;
	
	public abstract void recibirNoti (Notificacion n, LimiteNotificaciones l);
	public abstract int CantEmpleados();
	public abstract HashSet<Empleado> listarEmpleado();

}
