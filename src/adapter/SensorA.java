package adapter;

import other.CongestionsStatus;
import other.IdGenerator;

public class SensorA {
    private int id;
    private String sensorName;
    private Location location;
    private CongestionsStatus status;

    public SensorA(String sensorName, Location location, CongestionsStatus status) {
        id = IdGenerator.getInstance().getId();
        this.sensorName = sensorName;
        this.location = location;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSensorName() {
        return sensorName;
    }

    public void setSensorName(String sensorName) {
        this.sensorName = sensorName;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public CongestionsStatus getStatus() {
        return status;
    }

    public void setStatus(CongestionsStatus status) {
        this.status = status;
    }
}

