import java.rmi.*;

public class AppClient {
    public static void main(String[] args) {
        try {
            Server server = (Server) Naming.lookup("rmi://localhost:11099/Server");
            System.out.println(server.sendMessage("Ola!"));
        } catch (Exception e) {
            System.out.println("GenericException: " + e.getMessage());
        }
    }
}