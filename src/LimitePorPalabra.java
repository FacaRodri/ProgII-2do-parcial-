
public class LimitePorPalabra implements LimiteNotificaciones {
	String limite;
	
	public boolean limite (Notificacion n) {
		if (n.contiene(limite)) {
			return true;
		}
		else {
			return false;
		}
	}
}
