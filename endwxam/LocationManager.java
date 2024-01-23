package endwxam;

public class LocationManager {
    private double latitude = 0;
    private double longitude = 0;
    private static final LocationManager instance = new LocationManager();

    private LocationManager() {
    }

    public static LocationManager getInstance(){
        return instance;
    }

    public void setLocation(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}



