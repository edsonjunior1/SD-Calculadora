package sdcalc;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class rmi2 extends UnicastRemoteObject implements Calculadora2 {
    public rmi2 () throws RemoteException{
        double a, b;
    }

    @Override
    public double raizQuad(double a, double b) throws RemoteException {
        return Math.sqrt(a);
    }
    @Override
    public double potencia(double a, double b) throws RemoteException {
        return (Math.pow(a, b));
    }
    @Override
    public float porcent(float a, float b) throws RemoteException {
        return (b * a) / 100;
    }
}
