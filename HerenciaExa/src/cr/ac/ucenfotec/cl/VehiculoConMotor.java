package cr.ac.ucenfotec.cl;

public class VehiculoConMotor extends Vehiculo {

    private String combustible;

    public VehiculoConMotor() {
        super(); //llama al constructor de la clase padre
    }

    public VehiculoConMotor(String combustible) {
        this.combustible = combustible;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }
}
