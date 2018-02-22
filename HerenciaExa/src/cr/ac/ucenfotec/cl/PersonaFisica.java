package cr.ac.ucenfotec.cl;

public class PersonaFisica extends Persona{
   

	private String apellido;
    private String trabajo;
    private double salario;
    
    public String toString () {
    	return super.toString() + "PersonaFisica[apellido+trabajo+salario]";
    }

    public PersonaFisica() {
        super();//INVOCA AL CONSTRUCTOR DEL PADRE
        this.nombre = "ABC";
        this.setIdentificacion("12");
    }

    public PersonaFisica(String nombre,String identificacion,String telefono,String direccion,String apellido,
                         String trabajo, double salario) {
        super(identificacion,nombre,direccion,telefono);//  INVOCA AL CONSTRUCTOR DEL PADRE
        this.apellido = apellido;
        this.trabajo = trabajo;
        this.salario = salario;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
