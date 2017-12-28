/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rumah_Sakit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.DatabaseMetaData;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ardzix
 */
public class MySQLConnector {
    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    
    /**
     * Constructor
     */
    public MySQLConnector(){
        connect();
    }
    
    private void connect(){
        Properties prop = new Properties();
        InputStream input = null;
        try {
            // load a properties file
            input = new FileInputStream("config.properties");
            prop.load(input);
            
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.jdbc.Driver");
            // Setup the connection with the DB
            connect = DriverManager
                    .getConnection("jdbc:mysql://"+prop.getProperty("dbhost")+"/"+prop.getProperty("dbname")+"?"
                            + "user="+prop.getProperty("dbuser")+"&password="+prop.getProperty("dbpassword"));
            statement = connect.createStatement();
        } catch (IOException | ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            if (input != null) {
                    try {
                            input.close();
                    } catch (IOException e) {
                            e.printStackTrace();
                    }
            }
        }

    }

    // You need to close the resultSet
    public void close() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }

            if (statement != null) {
                statement.close();
            }

            if (connect != null) {
                connect.close();
            }
        } catch (Exception e) {

        }
    }
    
    public Connection get_connection(){
        return connect;
    }
    
    public void execute(String sql){
        try {
            statement.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(MySQLConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ResultSet execute_query(String query) throws SQLException{
        return statement.executeQuery(query);
    }
    

    public static void main(String[] args) {
        MySQLConnector connector = new MySQLConnector();
        connector.close();

    }
    
}
