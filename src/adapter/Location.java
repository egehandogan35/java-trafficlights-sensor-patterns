package adapter;

/**
 * x,y location
 */
public class Location {
    public int x;
    public int y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Location{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
