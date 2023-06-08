import java.util.Random;
import java.util.UUID;

public class Persona {
    private String nombre;
    private String apellido;
    private Integer edad;
    private String barrio;
    private String DNI;
    private String ocupacion;
    private String kitUUID;
    private long temp;

    public Persona(String nombre, String apellido, Integer edad, String barrio, String DNI, String ocupacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.barrio = barrio;
        this.DNI = DNI;
        this.ocupacion = ocupacion;
    }

    public Persona() {
    }

    public void generaTemp() {
        Random fiebre = new Random();
        this.temp = fiebre.nextInt(36, 40);
    }

    public void generarKitUUID(){
        this.kitUUID=UUID.randomUUID().toString();
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getTemp() {
        return temp;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getKitUUID() {
        return kitUUID;
    }
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", barrio='" + barrio + '\'' +
                ", DNI=" + DNI +
                ", ocupacion='" + ocupacion + '\'' +
                ", kitUUID='" + kitUUID + '\'' +
                '}';
    }

}
