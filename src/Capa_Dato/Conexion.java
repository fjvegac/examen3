package Capa_Dato;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
    
    Connection cn = null;
    
    public Connection Entrar(){
        try{
            Class.forName(".com.microsoft.sqlserver.jbdc.SQLServerDriver");
            cn = DriverManager.getConnection("jbdc:sqlserver://WIN-DP58R7L21IH:1433;DatabaseName = CONEXION_DB;user =postgres"+ ";password=asd");
            JOptionPane.showMessageDialog(null, "Conexion buena.");
        }catch (Exception e){
           JOptionPane.showMessageDialog(null, "Conexion mala, cambie los datos para su respectiva conexión.");
        }
        return cn;
    }
}
