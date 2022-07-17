package adapter;

import other.CongestionsStatus;

/**
 * ADAPTER PATTERN
 * there will be different sensors but they all need to give sensor data
 */
public class SensorAUser extends SensorA implements ISensor {
    public SensorAUser(String sensorName, Location location, CongestionsStatus status) {
        super(sensorName, location, status);
    }

    @Override
    public Location getLocation() {
        return super.getLocation();
    }

    @Override
    public CongestionsStatus getStatus() {
        return super.getStatus();
    }

    @Override
    public void resetSensor() {
        System.out.println("sensor is reseted");
    }

    @Override
    public String calculateType() {
        System.out.println("calculate by GPS");
        return "GPS";
    }


}
