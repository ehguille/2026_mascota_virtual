
public class Aplicacion {

	public static void main(String[] args) {
/*
		MascotaVirtual miMascota=new MascotaVirtual("Chuqui");		
		System.out.println(miMascota.getNombre());
		
		miMascota.comer();
		
		MascotaVirtual otraMascota=new MascotaVirtual("Peluso");
		otraMascota.comer();
		
		Cuidador unCuidador=new Cuidador();		
		unCuidador.alimentar(miMascota);	
		unCuidador.alimentar(otraMascota);
*/
/*		Propietario p = new Propietario("Tamagochi");
		p.jugar(10);
		
		Propietario p1 = new Propietario("Pikachu");
		p1.jugar(10);*/

		MascotaVirtual m1=new MascotaVirtual("Chuqui");
		MascotaVirtual m2=new MascotaVirtual("Alfajor");
		
		MascotaVirtual m3=m2;
		m2=m1;
		m1=m3;

		System.out.println(m1.getNombre());
		System.out.println(m2.getNombre());
	
	}

}
