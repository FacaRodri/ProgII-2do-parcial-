
public class OrdenarPorCantMensajes extends Comparador {
	
	public int compare(Empleado e1, Empleado e2) {
		return e1.cantMensajes() - e2.cantMensajes();
	}
}
