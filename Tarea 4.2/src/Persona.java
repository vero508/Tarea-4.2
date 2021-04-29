
public class Persona {

	//ATRIBUTOS
	private String nombre;
	private int edad;
	private double peso;
	private double altura;
	

	public final static int INFRAPESO= -1;
	public final static int PESO_IDEAL= 0;
	public final static int SOBREPESO= 1;
	
	
	//CONSTRUCTORES
	public Persona(String nombre, int edad, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
	}


	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}


	public Persona() {
		
	}
	
	// funcion para calcular el IMC de una persona
	
	public double calcularIMC() {
		double IMC;
		IMC=(peso/(altura*altura));
		if (IMC<20) {
			System.out.println("estas en infrapeso" + INFRAPESO);
			if (IMC >=20 && IMC <= 25) {
				System.out.println("Estas ideal" + PESO_IDEAL);
			}else {
				System.out.println("Estas en sobrepeso" + SOBREPESO);
			}
		}
		return IMC;
		
	}
	
	// funcion para dependiendo de su edad saber si esta bien su IMC o no
	public boolean esMayorEdad() {
		boolean mayor = false;
		
		if(edad >= 18) {
			mayor = true;
		}
		return mayor;
	}
	
	//METODOS GET Y SET
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}

	//TO STRING
	
	@Override
	public String toString() {
		return "Su nombre es: " + nombre + " su edad es: " + edad + " su peso es: " + peso + " su altura es " + altura ;
	}

	
}

