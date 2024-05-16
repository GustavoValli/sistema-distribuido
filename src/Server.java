import java.rmi.*;

public interface Server extends Remote {
    String sendMessage(String message) throws RemoteException;
}
