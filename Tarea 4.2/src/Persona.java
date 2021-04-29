
public class Persona {

	private String nombre;
	private int edad;
	private double peso;
	private double altura;
	

	public final static int INFRAPESO= -1;
	public final static int PESO_IDEAL= 0;
	public final static int SOBREPESO= 1;
	
	
	public Persona(String nombre, int edad, double peso, double altura) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
	}
	
	
}
