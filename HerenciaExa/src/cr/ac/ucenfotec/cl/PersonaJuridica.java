package cr.ac.ucenfotec.cl;

public class PersonaJuridica extends Persona {




	private String representante;
    private double ganancia;

    public PersonaJuridica() {
        super();
    }

    public PersonaJuridica(String representante, double ganancia) {
    	super ();
        this.representante = representante;
        this.ganancia = ganancia;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public double getGanancia() {
        return ganancia;
    }

    public void setGanancia(double ganancia) {
        this.ganancia = ganancia;
    }
	
    @Override
	public String toString() {
		return "PersonaJuridica [representante=" + representante + ", ganancia=" + ganancia + ", nombre=" + nombre
				+ ", direccion=" + direccion + ", telefono=" + telefono + "]";
	}
}
