package cr.ac.ucenfotec.ui;

import java.io.*;
import java.util.ArrayList;
import cr.ac.ucenfotec.cl.*;

public class UI {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintStream out = System.out;
	static ArrayList<Persona> personas=new ArrayList<>();

	public static void main(String[] args) throws java.io.IOException {
		
		registrarPersona();
		registrarPersonaJuridica();
		registrarPersonaFisica();
		imprimir();
	}
	
	public static void registrarPersona() throws java.io.IOException {
		String identificacion;
		String nombre;
		String direccion;
		String telefono;

		out.println("Digite la identificación");
		identificacion = in.readLine();
		out.println("Digite la nombre");
		nombre = in.readLine();
		out.println("Digite la dirección");
		direccion = in.readLine();
		out.println("Digite la teléfono");
		telefono = in.readLine();
		Persona miPersona=new Persona(identificacion, nombre, direccion, telefono);
		personas.add(miPersona);
	}
	
	public static void registrarPersonaJuridica() throws java.io.IOException {
		String representante;
		double ganancia;
		out.println("Digite el representante");
		representante = in.readLine();
		out.println("Digite la ganancia");
		ganancia = Double.parseDouble(in.readLine());
		PersonaJuridica pj=new PersonaJuridica (representante, ganancia);
		personas.add(pj);
	}
		
	
	public static void registrarPersonaFisica() throws java.io.IOException {
		String nombre;
		String identificacion;
		String telefono;
		String direccion;
		String apellido;
		String trabajo;
		double salario;

		out.println("Digite la nombre");
		nombre = in.readLine();
		out.println("Digite la identificación");
		identificacion = in.readLine();
		out.println("Digite la dirección");
		direccion = in.readLine();
		out.println("Digite la apellido");
		apellido = in.readLine();
		out.println("Digite la trabajo");
		trabajo = in.readLine();
		out.println("Digite la salario");
		salario = Double.parseDouble(in.readLine());
		out.println("Digite el teléfono");
		telefono = in.readLine();
		PersonaFisica miPersonaFisica=new PersonaFisica (nombre, identificacion, telefono, direccion, apellido, trabajo, salario);
		personas.add(miPersonaFisica);
	}
	
	public static void imprimir() {
		for (Persona var:personas)
		{
			out.println(var.toString());
			
		}
	}

}
