package adapter;

import other.CongestionsStatus;

public interface ISensor {
    int getId();
    Location getLocation();
    CongestionsStatus getStatus();
    //STATE PATTERN
    void setStatus(CongestionsStatus status);

    void resetSensor();

    String calculateType();
}
