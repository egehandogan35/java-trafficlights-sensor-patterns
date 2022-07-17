package observer;

import java.util.Observable;
import java.util.Observer;  
  
public class ResponseHandler1 implements Observer {  
    private String resp;  
    public void update(Observable obj, Object arg) {  
        if (arg instanceof String) {  
            resp = (String) arg;  
            System.out.println("\nReceived Response: " + resp );  
        }  
    }  
}