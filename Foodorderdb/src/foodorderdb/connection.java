/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodorderdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class connection {
    Connection conn=null;
    public Connection getConnection() {
        try{
         Class.forName("oracle.jdbc.driver.OracleDriver");
          conn = DriverManager.getConnection( "jdbc:oracle:thin:@127.0.0.1:1521:xe","system","anoop1234");  
        }catch(ClassNotFoundException  e){
        e.printStackTrace();
        } catch (SQLException ex) {
          ex.printStackTrace();
        }
        
     return conn;   
    }
    public static void main(String[] args){
    new connection().getConnection();
    }
}
