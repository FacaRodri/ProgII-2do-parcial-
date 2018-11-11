
public class LimitePorEmpleado implements LimiteNotificaciones {
	
	Empleado e;
	
	public boolean limite (Notificacion n) {
		if (n.remitente != e) {
			return false;
		}
		else {
			return true;
		}
	}

}
