/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package h15_firtsgui;

/**
 *
 * @author Josselyne GutiÃ©rrez
 */

import ec.edu.espe.h15_firstGUI.model.Employee;
import java.awt.HeadlessException;
    import java.sql.Connection;
    import javax.swing.JOptionPane;
    import static javax.swing.JOptionPane.WARNING_MESSAGE;


public class Connector {


	
    public static final String URL = "jdbc:mysql://localhost:3306/empleados";
    public static Employee user = new Employee();
	
    public static Connection connect()
    {
        Connection con = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            JOptionPane.showMessageDialog(null, "Conexión Exitosa");
            
        }
        catch (HeadlessException | ClassNotFoundException e)
        {
            JOptionPane.showMessageDialog(null, "Conexión Fallida", "ERROR",WARNING_MESSAGE);
        }
        return con;
                
    }
}


