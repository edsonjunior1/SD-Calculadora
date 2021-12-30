package sdcalc;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculadora2 extends Remote{
    public double raizQuad(double a, double b) throws RemoteException;
    public double potencia(double a, double b) throws RemoteException;
    public float porcent(float a, float b) throws RemoteException;
}
