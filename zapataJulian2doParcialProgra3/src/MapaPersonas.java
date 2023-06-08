import java.util.*;

public class MapaPersonas{
    private HashMap<String,Persona> MapPersonas;

    public MapaPersonas() {
        this.MapPersonas = new HashMap<String, Persona>();
    }

    public Boolean agregarPersona(String DNI, Persona nueva){
        Boolean agregado=false;
        if(!MapPersonas.containsKey(DNI)){
            MapPersonas.put(nueva.getDNI(),nueva);
            agregado=true;
        }
        return agregado;
    }

    public TablePersonasRegistro testear(){
        TablePersonasRegistro tabla =new TablePersonasRegistro();
        ArrayList<Persona>personas=new ArrayList<>(MapPersonas.values());
        for(Persona persona:personas){
            persona.generaTemp();
            tabla.agregarTable(persona);
        }
        return tabla;
    }

    public String encontrarBarrio(String DNI){
        String barrio = "NO ENCONTRADO";
        ArrayList<Persona>personas=new ArrayList<>(MapPersonas.values());
        for(Persona persona:personas){
            if(DNI.equals(persona.getDNI())){
                barrio=persona.getBarrio();
            }
        }
        return barrio;
    }

    public String encontrarUUID(String DNI){
        String UUID = "NO ENCONTRADO";
        ArrayList<Persona>personas=new ArrayList<>(MapPersonas.values());
        for(Persona persona:personas){
            if(DNI.equals(persona.getDNI())){
                UUID=persona.getKitUUID();
            }
        }
        return UUID;
    }

    public ArrayList<Persona> exportarComoArreglo(){
        ArrayList<Persona>personas=new ArrayList<>(MapPersonas.values());
        return personas;
    }
}
