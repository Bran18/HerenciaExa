package cr.ac.ucenfotec.ui;

import java.io.*;

import cr.ac.ucenfotec.cl.*;

public class Main {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintStream out = System.out;
	static CL logica = new CL();

	public static void main(String[] args) throws java.io.IOException {
		mostrarMenu();
	}

	public static void mostrarMenu() throws java.io.IOException {
		int opcion;
		opcion = -1;
		do {

			out.println("1. Registrar Personas");
			out.println("2. Registrar Personas Físicas");
			out.println("3. Registrar Personas Jurídicas");
			out.println("4. Registrar Personas Vehículos");
			out.println("5. Registrar Personas Vehículos de motor");
			out.println("6. Registrar Personas Vechículos sin motor");
			out.println("7. Listar Personas");
			out.println("8. Listar Personas Físicas");
			out.println("9. Listar Personas Jurídicas");
			out.println("10. Listar  Vehículos");
			out.println("11. Listar  Vehículos de motor");
			out.println("12. Listar  Vechículos sin motor");
			out.println("0. Salir");
			out.println("Digite el la opción");
			procesarOpcion(Integer.parseInt(in.readLine()));
		} while (opcion != 0);
	}

	public static void procesarOpcion(int pOpcion) throws java.io.IOException {
		switch (pOpcion) {
		case 1:
			UI.registrarPersona();
			break;
		case 2:
			UI.registrarPersonaFisica();
			break;
		case 3:
			UI.registrarPersonaJuridica();
			break;
		case 4:
			registrarVehiculo();
			break;
		case 5:
			registrarVehiculoMotor();
			break;
		case 6:
			registrarVehiculoSinMotor();
			break;
		case 7:
			listarPersona();
			break;
		case 8:
			listarPersonaFisica();
			break;
		case 9:
			listarPersonaJuridica();
			break;
		case 10:
			listarVehiculo();
			break;
		case 11:
			listarVehiculoMotor();
			break;
		case 12:
			listarrVehiculoSinMotor();
			break;

		case 13:
			listarRepresentantes();
			break;

		case 14:
			buscarRepresentante();
			break;

		case 0:
			out.println("Gracias por usar el sistema");
			break;
		default:
			out.println("Opción no válida");
			break;
		}
	}

	public static void registrarVehiculoMotor() throws java.io.IOException {
		String combustible;
		out.println("Digite el tipo de combustible");
		combustible = in.readLine();
		logica.registrarConMotor(combustible);
	}

	public static void registrarVehiculoSinMotor() throws java.io.IOException {
		String tipoLocomocion;
		out.println("Digite el tipo de locomoción");
		tipoLocomocion = in.readLine();
		logica.registrarSinMotor(tipoLocomocion);
	}

	public static void registrarVehiculo() throws java.io.IOException {
		String modelo;
		String color;
		String medio;
		out.println("Digite el modelo");
		modelo = in.readLine();
		out.println("Digite el color");
		color = in.readLine();
		out.println("Digite el medio");
		medio = in.readLine();
		logica.registrarVehiculo(modelo, color, medio);

	}

	public static void listarPersona() throws java.io.IOException {
		for (String var : logica.getPersonas()) {
			out.println(var.toString());
		}
	}

	public static void listarPersonaJuridica() throws java.io.IOException {
		for (String var : logica.getPersJuridicas()) {
			out.println(var.toString());
		}
	}

	public static void listarPersonaFisica() throws java.io.IOException {
		for (String var : logica.getPersFisicas()) {
			out.println(var.toString());
		}
	}

	public static void listarVehiculoMotor() throws java.io.IOException {
		for (String var : logica.getVehMotor()) {
			out.println(var.toString());
		}
	}

	public static void listarrVehiculoSinMotor() throws java.io.IOException {
		for (String var : logica.getVehSinMotor()) {
			out.println(var.toString());
		}
	}

	public static void listarVehiculo() throws java.io.IOException {
		for (String var : logica.getVehiculos()) {
			out.println(var.toString());
		}
	}

	public static void listarRepresentantes() {
		for (String var : logica.getPersJuridicas()) {
			out.println(var);

		}

	}

	public static void buscarRepresentante() {

		try {
			String cedula;
			out.println("Digite la cedula del cliente");
			cedula = in.readLine();

			out.println(logica.buscarRepresentante(cedula));

		} catch (Exception e) {
			out.print("ha ocurrido un error!");
		}

	}
}