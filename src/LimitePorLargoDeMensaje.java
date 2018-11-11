
public class LimitePorLargoDeMensaje implements LimiteNotificaciones {
	
	int limite;
	
	public boolean limite (Notificacion n) {
		if (n.cantPalabaras() < this.limite) {
			return true;
		}
		else {
			return false;
		}
	}

}
