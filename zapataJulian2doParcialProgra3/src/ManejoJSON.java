import com.google.gson.Gson;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

public class ManejoJSON {

    private HashMap<String,ArrayList> MapReg;

    public ManejoJSON() {
        this.MapReg = new HashMap<String, ArrayList>();
    }

    public void guardarenGson (MapaPersonas mapa) throws IOException{
        ArrayList<Persona>personas=mapa.exportarComoArreglo();
        ArrayList<Persona>sanos=new ArrayList<>();
        ArrayList<RegistroJSON>registrosJSON=new ArrayList<>();

        for (Persona persona: personas)
        {
            if(persona.getTemp()<38)
            {
                sanos.add(persona);

            }else{
                RegistroJSON reg = new RegistroJSON(persona.getKitUUID(), persona.getTemp(), persona.getBarrio());
                registrosJSON.add(reg);

            }
        }

        agregarReg("sanos",sanos);
        agregarReg("aislar",registrosJSON);

       try {
           Gson gson = new Gson();
           BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("gson.json"));

           gson.toJson(MapReg, MapReg.getClass(), bufferedWriter);
           bufferedWriter.newLine();
           bufferedWriter.close();
       }catch (IOException e) {
           System.out.println("Se produjo un error al escribir en el archivo: " + e.getMessage());
       }
    }

    public Boolean agregarReg(String estado,ArrayList lista){
        Boolean agregado=false;
            MapReg.put(estado,lista);
            agregado=true;
            agregado=true;
        return agregado;
    }

}
