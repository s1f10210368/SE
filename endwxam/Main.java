package endwxam;

public class Main {
    public static void main(String args[]) {
        LocationManager.getInstance().setLocation(35.0, 139.0);
        System.out.println(LocationManager.getInstance().getLongitude());
        System.out.println(LocationManager.getInstance().getLatitude());
    }
}
