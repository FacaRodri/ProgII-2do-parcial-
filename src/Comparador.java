import java.util.Comparator;

public abstract class Comparador implements Comparator<Empleado> {
	
	public abstract int compare(Empleado e1, Empleado e2);
}
