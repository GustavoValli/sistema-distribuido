import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class AppServer {

    public static void main(String[] args) {
        Registry registry;

        try {
            Server server = new ServerImpl();

            registry = LocateRegistry.createRegistry(11099);
            registry.rebind("Server", server);
            System.out.println("Server online...");

            Naming.rebind("rmi://localhost:1099/Server", server);
        } catch( Exception e ) {
            System.out.println("Trouble: " + e.getMessage());
        }
    }
}