package overdose.today.athena;

public class Athena {

    private static final Athena singleton = new Athena();
    private final String clientVersion = "2.0.0";
    private String clientName = "Athena";

    /**
     * Private constructor to prevent instantiation.
     */
    public static Athena getSingleton() {
        return singleton;
    }

    public void initialization() {
        System.out.println("Athena is initializing...");
    }

    /**
     * @return the clientVersion
     */
    public String getClientVersion() {
        return clientVersion;
    }

    /**
     * @return the clientName
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * @param clientName the clientName to set
     */
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

}
