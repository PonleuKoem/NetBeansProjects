/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienteditor;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author UC
 */
public class sqliteContention {
    Connection conn = null;
    public static Connection dbConnection(){
        try {
            Connection conn = DriverManager.getConnection("jdc:aqlite:C:\\Users\\UC\\Documents\\NetBeansProjects\\ClientEditor\\StudentManagement.sqlite");
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
