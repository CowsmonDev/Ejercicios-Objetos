package timbre;

public class Timbre {
    public static void hacerSonar(){
        System.out.println("ALARMA ACTIVADA!!!");
    }
    public static void hacerSonar(String mensaje){
        hacerSonar();
        System.out.println(mensaje);
    }

}
