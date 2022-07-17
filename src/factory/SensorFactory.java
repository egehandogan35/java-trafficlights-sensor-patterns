package factory;

import adapter.ISensor;
import adapter.Location;
import adapter.SensorAUser;
import adapter.SensorBUser;
import other.CongestionsStatus;

import java.util.Random;

public class SensorFactory {
    public static ISensor createSensor(String type){
        Random r = new Random();
            int x = r.nextInt(1000);
            int y = r.nextInt(1000);
        if(type.equals("a")){
            return new SensorAUser("a sensor",new Location(x,y), CongestionsStatus.light);
        }else if(type.equals("b")){
            return new SensorBUser("b sensor",new Location(x,y), CongestionsStatus.light);
        }
        return null;
    }
}
