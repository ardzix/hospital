/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rumah_Sakit;

import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author ardzix
 */
public class DataManager {
    
    private MySQLConnector connector;
    private String message;
    
    public DataManager(){
        initConnection();
        table_check();
    }
    
    public MySQLConnector get_connector(){
        return connector;
    }
    
    private void initConnection(){
        connector = new MySQLConnector();
    }
    
    
    private void table_check(){
        DatabaseMetaData meta;
        try {
            meta = connector.get_connection().getMetaData();
            ResultSet user = meta.getTables(null, null, "DBUSER", 
            new String[] {"TABLE"});
            if(!user.next()){
                System.out.println("Tabble USER not found, \nCreating new one. . .");
		String createUserTableSQL = "CREATE TABLE DBUSER(USER_ID INT(5) NOT NULL AUTO_INCREMENT, USERNAME VARCHAR(20) NOT NULL, PASSWORD VARCHAR(32) NOT NULL, ROLE VARCHAR(20), PRIMARY KEY (USER_ID) );";
                String insertUserSQL = "INSERT INTO `DBUSER` (`USER_ID`, `USERNAME`, `PASSWORD`, `ROLE`) VALUES (NULL, 'admin', '21232f297a57a5a743894a0e4a801fc3', 'admin')";
                connector.execute(createUserTableSQL);
		connector.execute(insertUserSQL);
                System.out.println("Table \"USER\" is created!");
            }else{
                System.out.println("Table \"USER\" checked");
            }
        } catch (SQLException ex) {
            Logger.getLogger(MySQLConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String get_message(){
        return message;
    }
    
    public boolean login(String username, char[] password, String role){
        try {
            byte[] bytesOfPassword = new String(password).getBytes();
            System.out.println("Logging "+username+" in!");
            
//          Encrypt password using md5 digest
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(bytesOfPassword);
            byte[] mdbytes = md.digest();
            //convert the byte to hex format method 1
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < mdbytes.length; i++) {
              sb.append(Integer.toString((mdbytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            String encrypted_password = sb.toString();
            
            String select_sql = "SELECT * FROM `DBUSER` WHERE `USERNAME` LIKE '"+username+"'";
            ResultSet rs = connector.execute_query(select_sql);
            if(!rs.last()){
                message = "Login Failed, please check your username or password";
                System.out.println("User not found");
                return false;
            }
            
            String rs_username = rs.getString(2);
            String rs_password = rs.getString(3);
            String rs_role = rs.getString(4);
            
//            Check if password match
            if(!rs_password.equals(encrypted_password)){
                message = "Login Failed, please check your username or password";
                System.out.println("Password missmatch");
            }
            
//            Check if role match
            if(!rs_role.equals(role)){
                message = "Login Failed, You are not authorized to access this menu";
                System.out.println("Role missmatch");
            }

        }catch (SQLException | NoSuchAlgorithmException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        message = "Login Success!!";
        System.out.println(message);
        return true;
    }
}
