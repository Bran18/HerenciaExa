package cr.ac.ucenfotec.cl;

public class Vehiculo {

    private String modelo;
    private String color;
    private String medio;

    public Vehiculo() {
    }

    public Vehiculo(String modelo, String color, String medio) {
        this.modelo = modelo;
        this.color = color;
        this.medio = medio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMedio() {
        return medio;
    }

    public void setMedio(String medio) {
        this.medio = medio;
    }
}
