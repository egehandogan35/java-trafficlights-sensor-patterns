package adapter;

import other.CongestionsStatus;
import other.IdGenerator;

public class SensorBUser extends  SensorB implements ISensor{

    public SensorBUser(String name, Location location, CongestionsStatus status) {
        super(name, location, status);
    }

    @Override
    public int getId() {
        return IdGenerator.getInstance().getId();
    }


    @Override
    public void resetSensor() {
        System.out.println("sensor is reseted");
    }

    @Override
    public String calculateType() {
        System.out.println("calculate by BFM");
        return "BFM";
    }
}
