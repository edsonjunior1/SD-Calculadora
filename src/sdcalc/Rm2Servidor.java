package sdcalc;

import javax.swing.*;
import java.rmi.registry.Registry;

public class Rm2Servidor {
    public static void main(String[] args){
        try{
            Registry r = java.rmi.registry.LocateRegistry.createRegistry(1097);
            r.rebind("Calculadora", new rmi2());
            JOptionPane.showMessageDialog(null, "Servidor Conectado");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Servidor2 Desconectado" + e);
        }
    }
}
