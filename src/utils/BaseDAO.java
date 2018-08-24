package utils;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Sensor;

public class BaseDAO {

	private static String bdDriver = "com.mysql.cj.jdbc.Driver";
    private static String bdUrl = "jdbc:mysql://localhost:3306/gsfibertrail?autoReconnect=true & serverTimezone=GMT";
    private static String bdName = "root";
    private static String bdpwd = "123456";
    private static Connection conn = null;
    
    private BaseDAO(){
        try{
            Class.forName(bdDriver);
            conn = DriverManager.getConnection(bdUrl,bdName,bdpwd);
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
 
    public static Connection getConn(){
       // if(conn == null)
            new BaseDAO();
        return conn;
    }
 
    public static void ColseAll(ResultSet rs,Statement stat,Connection conn){
       try{
            if(rs != null)
                rs.close();
            if(stat != null)
                stat.close();
            if(conn != null)
            	conn.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
	
}
