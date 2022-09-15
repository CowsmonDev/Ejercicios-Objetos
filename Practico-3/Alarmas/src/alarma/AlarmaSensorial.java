package alarma;

import sensores.Sensor;
import timbre.Timbre;

import java.util.HashMap;
import java.util.Map;

public class AlarmaSensorial {

    private final Map<String, Sensor> zonas = new HashMap<>();

    public boolean isZona(String zona) {
        return zonas.containsKey(zona);
    }

    public void agregarZona(String zona){
        if(!isZona(zona))
            zonas.put(zona, new Sensor(zona));
    }

    public void eliminarZona(String zona){
        if(isZona(zona))
            zonas.remove(zona);
    }

    public Sensor getSensor(String zona){
        if(isZona(zona))
            return zonas.get(zona);
        return null;
    }

   public void comprobar(){
        String mensaje = "La Alarma esta Activa en:\n";
        for(Map.Entry<String, Sensor> entry : zonas.entrySet()){
            if(entry.getValue().isSensor())
                mensaje = mensaje.concat("- ").concat(entry.getValue().getZona()).concat("\n");
        }
       Timbre.hacerSonar(mensaje);
   }

}
