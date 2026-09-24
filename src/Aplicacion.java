
public class Aplicacion {

	public static void main(String[] args) {
		MascotaVirtual miMascota=new MascotaVirtual("Chuqui");
		miMascota.saludar("¡Buenos días!");
		miMascota.saludar("¿Qué tal?");	
		
		miMascota.jugar(20);
		miMascota.mostrarEstado();
	}

}
