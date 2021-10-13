package sdcalc;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class rmi extends UnicastRemoteObject implements Calculadora{
    public rmi () throws RemoteException{
        int a, b;
    }
    @Override
    public int add (int a, int b) throws RemoteException {
        return a + b;
    }
    @Override
    public int sub (int a, int b) throws RemoteException {
        return a - b;
    }
    @Override
    public int mul (int a, int b) throws RemoteException {
        return a * b;
    }
    @Override
    public int div (int a, int b) throws RemoteException {
        return a / b;
    }
}