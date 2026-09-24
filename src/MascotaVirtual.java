
public class MascotaVirtual {
	
	//Una mascotaVirtual debe tener nombre y niveles de hambre, felicidad y energía.
	private String nombre;
/*	private int nivelHambre;
	private int nivelFelicidad;
	private int nivelEnergia; */
	private int nivelHambre, nivelFelicidad, nivelEnergia;

	//Cada mascota puede tener un nombre distinto, pero todas empiezan teniendo 50 puntos de hambre, 50 de felicidad y 100 de energía.
	//Método constructor, se invoca cada vez que se crea una mascota virtual (new MascotaVirtual...)
	public MascotaVirtual(String nombreMascota) {
		nombre=nombreMascota;
		nivelHambre=50;
		nivelFelicidad=50;
		nivelEnergia=100;
		System.out.println("Se ha creado la mascota virtual llamada "+nombre);
	}
	
	public void saludar(String saludo) {
		System.out.println(saludo);
	}
	
	public void jugar(int numeroMinutos) {
		nivelEnergia=nivelEnergia-2*numeroMinutos;
		System.out.println(nombre+" ha jugado, su energía ahora es "+nivelEnergia);
		//Sigue...
	}
	
	public void mostrarEstado(){
		System.out.println("Nombre: "+nombre);
		System.out.println("Nivel de hambre: "+nivelHambre);
		System.out.println("Nivel de felicidad: "+nivelFelicidad);
		System.out.println("Nivel de energía: "+nivelEnergia);
	}
	
	
}
