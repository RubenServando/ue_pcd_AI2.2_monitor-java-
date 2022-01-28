
public class Sistema {

	public static void main(String[] args) {
		
		MonitorPuente monitor = new MonitorPuente();
		
		//	Coches Dirección Norte-Sur
		new Coches("coche rojo en dirección Norte-Sur", monitor);
		new Coches("coche azul en dirección Norte-Sur", monitor);
		new Coches("coche verde en dirección Norte-Sur", monitor);
		
		
		// Coches Dirección Sur-Norte
		new Coches("coche amarillo en dirección Sur-Norte", monitor);
		new Coches("coche blanco en dirección Sur-Norte", monitor);
		new Coches("coche negro en dirección Sur-Norte", monitor);
	}

}
