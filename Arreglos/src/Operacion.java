import java.util.Scanner;

public class Operacion {
	
	
	private Alumno[] list = new Alumno[10];
	private Alumno alumno = new Alumno();
	
	
	public void recorrerAlumno() {
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<10; i++) {
		
		System.out.println("Ingrese el nombre del alumno");
		alumno.setNombre(sc.next());
		
		System.out.println("Ingrese el nombre del alumno");
		alumno.setApellido(sc.next());

		System.out.println("Ingrese el nombre del alumno");
		alumno.setNota(sc.nextDouble());
		
		list[i] = alumno;
		
		}
		
		for(int i = 0; i<list.length; i++) {
		System.out.println("El alumno ingresado es : " + list[i]);
		}

		
	}

}