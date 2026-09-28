
public class Aplicacion {

	public static void main(String[] args) {
		MascotaVirtual miMascota=new MascotaVirtual("Chuqui");		
		System.out.println(miMascota.getNombre());
		
		miMascota.comer();
		
		Cuidador unCuidador=new Cuidador();		
		unCuidador.alimentar(miMascota);
		unCuidador.jugar(miMascota, 3);
		
	}

}
