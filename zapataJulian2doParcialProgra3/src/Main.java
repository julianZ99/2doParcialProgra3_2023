import com.google.gson.Gson;

import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Persona persona1 = new Persona("Natalia", "Natalia", 30, "Las Avenidas", "12345678", "Plomero");
        Persona persona2 = new Persona("Lionel", "Messi", 31, "El Martillo", "22345678", "Carnicero");
        Persona persona3 = new Persona("Michael", "Jordan", 32, "Alfar", "32345678", "Gasista");
        Persona persona4 =new Persona("Tiger", "Woods", 33, "Materno Infantil", "42345678", "Policia");
        Persona persona5 = new Persona("Juan", "Perez", 34, "Puerto", "52345678", "Dentista");
        Persona persona6 = new Persona("Marcelo", "Gallardo", 35, "Mundialista", "62345678", "Bombero");


        MapaPersonas personasEspera =  new MapaPersonas();
        persona1.generarKitUUID();
        personasEspera.agregarPersona(persona1.getDNI(), persona1);
        persona2.generarKitUUID();
        personasEspera.agregarPersona(persona2.getDNI(), persona2);
        persona3.generarKitUUID();
        personasEspera.agregarPersona(persona3.getDNI(), persona3);
        persona4.generarKitUUID();
        personasEspera.agregarPersona(persona4.getDNI(), persona4);
        persona5.generarKitUUID();
        personasEspera.agregarPersona(persona5.getDNI(), persona5);
        persona6.generarKitUUID();
        personasEspera.agregarPersona(persona6.getDNI(), persona6);

        TablePersonasRegistro tabla;
        tabla=personasEspera.testear();

        tabla.aislar(personasEspera);

        ManejoJSON gson =new ManejoJSON();

        gson.guardarenGson(personasEspera);
        }


    }
