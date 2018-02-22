package cr.ac.ucenfotec.cl;
import java.util.ArrayList;
public class CL {
    private ArrayList<Persona> personas;
    private ArrayList<PersonaJuridica> juridicas;
    private ArrayList<PersonaFisica> fisicas;
    private ArrayList<Vehiculo> vehiculos;
    private ArrayList<VehiculoConMotor> conMmotor;
    private ArrayList<VehiculoSinMotor> sinMotor;
    public CL()
    {
        personas = new ArrayList<>();
        juridicas = new ArrayList<>();
        fisicas = new ArrayList<>();
        vehiculos = new ArrayList<>();
        conMmotor = new ArrayList<>();
        sinMotor= new ArrayList<>();
    }

    public void registrarPersona(String identificacion, String nombre, String direccion, String telefono)
    {
        Persona miPersona = new Persona(identificacion,nombre,direccion,telefono);
        personas.add(miPersona);
    }

    public void registrarJuridica(String representante, double ganancia)
    {
        PersonaJuridica miPersona = new PersonaJuridica(representante,ganancia);
        juridicas.add(miPersona);

    }
    public void registrarFisica(String nombre,String identificacion,String telefono,String direccion,String apellido,
                                String trabajo, double salario)
    {
        PersonaFisica miPersona = new PersonaFisica(nombre,identificacion,telefono,direccion,apellido,trabajo,salario);
        fisicas.add(miPersona);

    }
    public void registrarVehiculo (String modelo, String color, String medio)
    {
        Vehiculo miVehiculo = new Vehiculo(modelo,color,medio);
        vehiculos.add(miVehiculo);

    }
    public void registrarSinMotor(String tipoLocomocion)
    {
        VehiculoSinMotor miVehiculo = new VehiculoSinMotor(tipoLocomocion);
        sinMotor.add(miVehiculo);

    }
    public void registrarConMotor(String combustible)
    {
        VehiculoConMotor miVehiculo = new VehiculoConMotor(combustible);
        conMmotor.add(miVehiculo);
    }


    public String [] getPersonas()
    {
        String []datos;
        int i;
        i= 0;
        datos = new String [personas.size()];
        for (Persona var : personas)
        {
            datos[i] = var.toString();
            i++;
        }
        return datos;
    }

    public String [] getPersFisicas()
    {
        String []datos;
        int i;
        i= 0;
        datos = new String [fisicas.size()];
        for (PersonaFisica var : fisicas)
        {
            datos[i] = var.toString();
            i++;
        }
        return datos;
    }
    public String [] getPersJuridicas()
    {
        String []datos;
        int i;
        i= 0;
        datos = new String [juridicas.size()];
        for (PersonaJuridica var : juridicas)
        {
            datos[i] = var.toString();
            i++;
        }
        return datos;
    }
    
    public String [] getRepresentantes()
    {
        String []datos;
        int i;
        i= 0;
        datos = new String [juridicas.size()];
        for (PersonaJuridica var : juridicas)
        {
            datos[i] = var.getRepresentante();
            i++;
        }
        return datos;
    }
    public String [] getVehiculos()
    {
        String []datos;
        int i;
        i= 0;
        datos = new String [vehiculos.size()];
        for (Vehiculo var : vehiculos)
        {
            datos[i] = var.toString();
            i++;
        }
        return datos;
    }
    public String [] getVehMotor()
    {
        String []datos;
        int i;
        i= 0;
        datos = new String [conMmotor.size()];
        for (VehiculoConMotor var : conMmotor)
        {
            datos[i] = var.toString();
            i++;
        }
        return datos;
    }
    public String [] getVehSinMotor()
    {
        String []datos;
        int i;
        i= 0;
        datos = new String [sinMotor.size()];
        for (VehiculoSinMotor var : sinMotor)
        {
            datos[i] = var.toString();
            i++;
        }
        return datos;
    }
    
    public String buscarRepresentante(String cedula){
        String result="";
        for(PersonaJuridica var: juridicas){
            if (var.getIdentificacion().equals(cedula)) {
            	result= var.getRepresentante();
                break;
            }else {
            	result=("no se encontro");
            }
        }
        return result;
    }




}
