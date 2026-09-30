
public class Propietario {
	
	private MascotaVirtual miMascota;
	
	public Propietario(String nombreMascota) {
		System.out.println("Se crea un propietario.");
		miMascota=new MascotaVirtual(nombreMascota);
	}
	
	public void jugar(int numeroMinutos) {
		miMascota.jugar(numeroMinutos);
	}

}
