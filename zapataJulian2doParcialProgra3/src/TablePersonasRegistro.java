
import com.google.gson.Gson;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;

public class TablePersonasRegistro {
    private Hashtable<String, RegistroTest> tablaReg;

    public TablePersonasRegistro() {
        tablaReg = new Hashtable<>();
    }

    public Boolean agregarTable(Persona nueva) {
        Boolean agregado = false;
        if (!tablaReg.containsKey(nueva)) {
            RegistroTest reg = new RegistroTest(nueva.getDNI(), nueva.getTemp());
            tablaReg.put(nueva.getKitUUID(), reg);
            agregado = true;
        }
        return agregado;
    }

    public void aislar(MapaPersonas mapa) throws IOException {
        ArrayList<RegistroTest> registros = new ArrayList<>(tablaReg.values());
        for (RegistroTest reg : registros) {
            if (reg.getTemp() >= 38) ///throw ExceptionFiebre
            {
                String barrio = mapa.encontrarBarrio(reg.getDNI());
                String UUID = mapa.encontrarUUID(reg.getDNI());
                try {
                    RegistroArchivo regArch = new RegistroArchivo(barrio, UUID);
                    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("urgente.dat"));
                    bufferedWriter.newLine();
                    bufferedWriter.write(regArch.toString());
                    bufferedWriter.close();
                } catch (IOException e) {
                    System.out.println("Se produjo un error al escribir en el archivo: " + e.getMessage());
                }
            }
        }
    }

}


