package other;

import adapter.ISensor;
import adapter.Location;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class User implements Observer {
    private String sensorResponseData;
    private Location location;
    private String userName;
    private List<ISensor> sensors;
    private List<Location> route;

    public User(Location location, String userName) {
        this.location = location;
        this.userName = userName;

        sensors = new ArrayList<>();
        route = new ArrayList<>();
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<ISensor> getSensors() {
        return sensors;
    }

    public void setSensors(List<ISensor> sensors) {
        this.sensors = sensors;
    }

    @Override
    public void update(Observable obj, Object arg) {
        if (arg instanceof String) {
            sensorResponseData = (String) arg;
            System.out.println("\nReceived Response: " + sensorResponseData);

            calculateRouteAgain();
            drawMapWithNewCalculation();
        }
    }

    private void drawMapWithNewCalculation() {
    }

    private void calculateRouteAgain() {
        for (Location location1 : route) {
            for (ISensor sensor : sensors) {
                if(sensor.getLocation().equals(location1)){
                    String s = sensor.calculateType();
                    if(s.equals("GPS")){

                    }else if(s.equals("BFM")){

                    }
                }
            }
        }
    }

    public String getSensorResponseData() {
        return sensorResponseData;
    }

    public List<Location> getRoute() {
        return route;
    }
}
