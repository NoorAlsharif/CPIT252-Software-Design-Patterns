
public class Connect {

    private static Connect instance;

    private void Connect() {
        
    }

    public Connect getInstance() {
        
        if (instance == null) {
            instance = new Connect();
        }
        System.out.println("Connected to Database");
        return instance;
    }
}










