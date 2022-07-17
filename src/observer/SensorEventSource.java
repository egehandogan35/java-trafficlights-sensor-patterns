package observer;

import other.CongestionsStatus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Observable;
import java.util.Random;

/**
 * OBSERVER PATTERN SENDS STATUS TO ALL OBSERVERS
 */
public class SensorEventSource extends Observable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            CongestionsStatus[] values = CongestionsStatus.values();

            Random r = new Random();
            int randm = r.nextInt(values.length);

            setChanged();
            notifyObservers(values[randm]);
        }
    }
}