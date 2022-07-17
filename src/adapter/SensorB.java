package adapter;

import other.CongestionsStatus;

public class SensorB {
    private String name;
    private Location location;
    private CongestionsStatus status;

    public SensorB(String name, Location location, CongestionsStatus status) {
        this.name = name;
        this.location = location;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

