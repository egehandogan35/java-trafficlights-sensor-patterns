import adapter.ISensor;
import adapter.Location;
import factory.SensorFactory;
import observer.SensorEventSource;
import other.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Program {
    List<ISensor> sensors = new ArrayList<>();
    List<User> users = new ArrayList<>();

    public Program() {

        for (int i = 0; i < 100; i++) {
            sensors.add(SensorFactory.createSensor(i % 2 == 0 ? "a" : "b"));
        }

        final SensorEventSource sensorEventSource = new SensorEventSource();
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int x = r.nextInt(1000);
            int y = r.nextInt(1000);
            User user = new User(new Location(x, y), String.valueOf(i));
            users.add(user);
            sensorEventSource.addObserver(user);
        }

        listSensors();

        Thread thread = new Thread(sensorEventSource);
        thread.start();

        resetSensors();
    }

    public void listSensors() {
        for (ISensor sensor : sensors) {
            System.out.println(sensor.getId());
            System.out.println(sensor.getLocation());
            System.out.println(sensor.getStatus());
            System.out.println("---------------------\n");
        }
    }

    public void resetSensors() {
        for (ISensor sensor : sensors) {
            sensor.resetSensor();
        }
    }


    public static void main(String[] args) {
        new Program();
    }
}
