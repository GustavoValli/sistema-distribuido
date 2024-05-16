import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServerImpl extends UnicastRemoteObject implements Server {

    public ServerImpl() throws RemoteException {
        super();
    }

    public String sendMessage(String message) throws RemoteException {
        return "Message: " + message;
    }
}