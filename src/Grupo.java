import java.util.*;
public class Grupo extends Usuario {
	ArrayList<Usuario> integrantes;

	public void recibirNoti(Notificacion n, LimiteNotificaciones l) {
		for(int i = 0; i < integrantes.size(); i++) {
				integrantes.get(i).recibirNoti(n, l);
		}	
	}
	
	public int CantEmpleados() {
	int suma = 0;
		for (int i = 0; i < integrantes.size(); i++) {
			 suma += integrantes.get(i).CantEmpleados();
		}
		
		return suma;
		
	}
	public HashSet<Empleado> listarEmpleado(){
		HashSet<Empleado> aux = new HashSet <>();
		for (int i = 0; i < integrantes.size(); i++) {
			HashSet<Empleado> e = integrantes.get(i).listarEmpleado();
			Collections.sort(e, );
			aux.addAll(e);
		}
		
		ArrayList <Empleado> a = new ArrayList<Empleado>(aux);
		HashSet <Empleado> i = new HashSet<Empleado>(a);
		return i;
		
	}

}


