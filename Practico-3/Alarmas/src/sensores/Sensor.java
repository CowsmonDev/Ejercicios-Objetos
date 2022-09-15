package sensores;

public class Sensor {

    private final String zona;

    private boolean sensor = false;

    public Sensor(String zona) {
        this.zona = zona;
    }

    public void setSensor(boolean sensor) { this.sensor = sensor; }

    public String getZona() { return zona; }
    public boolean isSensor() { return sensor; }


}
