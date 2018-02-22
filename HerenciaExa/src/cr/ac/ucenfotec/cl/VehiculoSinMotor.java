package cr.ac.ucenfotec.cl;

public class VehiculoSinMotor extends Vehiculo{
    private String tipoLocomocion;

    public VehiculoSinMotor()  {
        super();// llama al constructor del padre
    }

    public VehiculoSinMotor(String tipoLocomocion) {
        this.tipoLocomocion = tipoLocomocion;
    }

    public String getTipoLocomocion() {
        return tipoLocomocion;
    }

    public void setTipoLocomocion(String tipoLocomocion) {
        this.tipoLocomocion = tipoLocomocion;
    }
}
