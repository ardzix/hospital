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
import java.util.ArrayList;

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
            ResultSet user = meta.getTables(null, null, "DBUSER", new String[] {"TABLE"});
            ResultSet medicine = meta.getTables(null, null, "MEDICINE", new String[] {"TABLE"});
            ResultSet patient = meta.getTables(null, null, "PATIENT", new String[] {"TABLE"});
            
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
            if(!medicine.next()){
                System.out.println("Tabble MEDICINE not found, \nCreating new one. . .");
                String createMedicineTableSQL = "CREATE TABLE `hospital`.`MEDICINE` ( `MEDICINE_ID` INT(5) NOT NULL AUTO_INCREMENT, `NAME` VARCHAR(255) NOT NULL , `PRICE` INT(12) NOT NULL , `INGREDIENTS` TEXT NULL , `EFFECTS` TEXT NULL , `BEST_FOR` TEXT NULL , PRIMARY KEY (`MEDICINE_ID`))";
                connector.execute(createMedicineTableSQL);
                System.out.println("Table \"MEDICINE\" is created!");
            }else{
                System.out.println("Table \"MEDICINE\" checked");
            }
            if(!patient.next()){
                System.out.println("Tabble PATIENT not found, \nCreating new one. . .");
                String createMedicineTableSQL = "CREATE TABLE `hospital`.`PATIENT` ( `PATIENT_ID` INT(5) NOT NULL AUTO_INCREMENT , `NAME` VARCHAR(255) NOT NULL , `ADDRESS` TEXT NULL , `AGE` INT(3) NULL , `GENDER` VARCHAR(15) NOT NULL , `ALLERGY` TEXT NULL , `BLOOD_TYPE` VARCHAR(2) NOT NULL , PRIMARY KEY (`PATIENT_ID`));";
                connector.execute(createMedicineTableSQL);
                System.out.println("Table \"PATIENT\" is created!");
            }else{
                System.out.println("Table \"PATIENT\" checked");
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
            System.out.println("Logging "+username+" in!");
            
//          Encrypt password using md5 digest
            byte[] bytesOfPassword = new String(password).getBytes();
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
                return false;
            }
            
//            Check if role match
            if(!rs_role.equals(role)){
                message = "Login Failed, You are not authorized to access this menu";
                System.out.println("Role missmatch");
                return false;
            }

        }catch (SQLException | NoSuchAlgorithmException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        message = "Login Success!!";
        System.out.println(message);
        return true;
    }
    
    public ArrayList<Object> get_admins(){
        ArrayList<Object> objs = new ArrayList<>();
        try {
            String select_sql = "SELECT * FROM `DBUSER`";
            ResultSet rs = connector.execute_query(select_sql);
            while(rs.next()){
                objs.add(new Object[]{rs.getInt(1), rs.getString(2), rs.getString(4)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return objs;
    }

    void save_admin(int user_id, String[] data) {
        try {
            String username = data[0];
            String password = data[1];
            String role = data[2];
            
//          Encrypt password using md5 digest
            byte[] bytesOfPassword = new String(password).getBytes();
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(bytesOfPassword);
            byte[] mdbytes = md.digest();
            //convert the byte to hex format method 1
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < mdbytes.length; i++) {
                sb.append(Integer.toString((mdbytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            String encrypted_password = sb.toString();
            if(user_id>=0){
                String update_sql = "UPDATE `DBUSER` SET `USERNAME` = '"+username+"', `PASSWORD` = '"+encrypted_password+"', `ROLE` = '"+role+"' WHERE `USER_ID` = "+user_id;
                connector.execute(update_sql);
            }else{
                String create_sql = "INSERT INTO `DBUSER` (`USERNAME`, `PASSWORD`, `ROLE`) VALUES ('"+username+"', '"+encrypted_password+"', '"+role+"')";
                connector.execute(create_sql);
            }
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    Object[] get_admin(int user_id) {
        Object[] admin = null;
        try {
            String select_sql = "SELECT * FROM `DBUSER` WHERE `USER_ID` = "+user_id;
            ResultSet rs = connector.execute_query(select_sql);
            rs.next();
            admin = new Object[]{rs.getInt(1), rs.getString(2), rs.getString(4)};
        } catch (SQLException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return admin;
    }

    void delete_admin(int user_id) {
        String sql_delete = "DELETE FROM `DBUSER` WHERE `USER_ID` = "+user_id;
        connector.execute(sql_delete);
    }

    ArrayList<Object> get_medicines() {
        ArrayList<Object> objs = new ArrayList<>();
        try {
            String select_sql = "SELECT MEDICINE_ID, NAME, PRICE FROM `MEDICINE`";
            ResultSet rs = connector.execute_query(select_sql);
            while(rs.next()){
                objs.add(new Object[]{rs.getInt(1), rs.getString(2), rs.getInt(3)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return objs;
    }

    Object[] get_medicine(int medicine_id) {
        Object[] medicine = null;
        try {
            String select_sql = "SELECT * FROM `MEDICINE` WHERE `MEDICINE_ID` = "+medicine_id;
            ResultSet rs = connector.execute_query(select_sql);
            rs.next();
            medicine = new Object[]{rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)};
        } catch (SQLException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return medicine;
    }

    void save_medicine(int medicine_id, String[] data) {
        String name = data[0];
        String price = data[1];
        String ingredients = data[2];
        String effects = data[3];
        String best_for = data[4];
        
        if(medicine_id>=0){
            String update_sql = "UPDATE `MEDICINE` SET `NAME` = '"+name+"', `PRICE` = "+price+", `INGREDIENTS` = '"+ingredients+"', `EFFECTS` = '"+effects+"', `BEST_FOR` = '"+best_for+"' WHERE `MEDICINE_ID` = "+medicine_id;
            connector.execute(update_sql);
        }else{
            String create_sql = "INSERT INTO `MEDICINE` (`NAME`, `PRICE`, `INGREDIENTS`, `EFFECTS`, `BEST_FOR`) VALUES ('"+name+"', "+price+", '"+ingredients+"', '"+effects+"', '"+best_for+"')";
            connector.execute(create_sql);
        }
    }

    void delete_medicine(Integer medicine_id) {
        String sql_delete = "DELETE FROM `MEDICINE` WHERE `MEDICINE_ID` = "+medicine_id;
        connector.execute(sql_delete);
    }

    ArrayList<Object> get_patients() {
        ArrayList<Object> objs = new ArrayList<>();
        try {
            String select_sql = "SELECT PATIENT_ID, NAME, AGE FROM `PATIENT`";
            ResultSet rs = connector.execute_query(select_sql);
            while(rs.next()){
                objs.add(new Object[]{rs.getInt(1), rs.getString(2), rs.getInt(3)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return objs;//To change body of generated methods, choose Tools | Templates.
    }

    Object[] get_patient(int patient_id) {
        Object[] medicine = null;
        try {
            String select_sql = "SELECT * FROM `PATIENT` WHERE `PATIENT_ID` = "+patient_id;
            ResultSet rs = connector.execute_query(select_sql);
            rs.next();
            medicine = new Object[]{rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)};
        } catch (SQLException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return medicine;
    }

    void save_patient(int patient_id, String[] data) {
        String name = data[0];
        String address = data[1];
        String age = data[2];
        String gender = data[3];
        String allergy = data[4];
        String blood_type = data[5];
        
        if(patient_id>=0){
            String update_sql = "UPDATE `PATIENT` SET `NAME` = '"+name+"', `ADDRESS` = '"+address+"', `AGE` = "+age+", `GENDER` = '"+gender+"', `ALLERGY` = '"+allergy+"', `BLOOD_TYPE` = '"+blood_type+"' WHERE `PATIENT_ID` = "+patient_id;
            connector.execute(update_sql);
        }else{
            String create_sql = "INSERT INTO `PATIENT` (`NAME`, `ADDRESS`, `AGE`, `GENDER`, `ALLERGY`, `BLOOD_TYPE`) VALUES ('"+name+"', '"+address+"', "+age+", '"+gender+"', '"+allergy+"', '"+blood_type+"')";
            connector.execute(create_sql);
        }
    }

    void delete_patient(Integer patient_id) {
        String sql_delete = "DELETE FROM `PATIENT` WHERE `PATIENT_ID` = "+patient_id;
        connector.execute(sql_delete);
    }
}
