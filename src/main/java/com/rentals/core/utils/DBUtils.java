package com.rentals.core.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;

public class DBUtils {
	final static Logger logger = Logger.getLogger(DBUtils.class);

	public static Connection getConnection() {
		Connection conn = null;
		try {
			String jdbcDriver=PropertyFileReader.getPropFileReader().getValue("DB.JDBCDRIVER");
			String dburl=PropertyFileReader.getPropFileReader().getValue("DB.URL");
			String user=PropertyFileReader.getPropFileReader().getValue("DB.USER");
			String pwd=PropertyFileReader.getPropFileReader().getValue("DB.PWD");
			Class.forName(jdbcDriver);
			String url = dburl;
			conn = DriverManager.getConnection(url,user,pwd);
		} catch (SQLException e) {
			logger.error("RentalsDB", e);
		} catch (ClassNotFoundException e) {
			logger.error("RentalsDB", e);
		}
		return conn;
	}

	public static void closeAllDbConnections(Connection conn, Statement stmt, ResultSet rs) {
		try {
			if(conn!=null)
				conn.close();
			if(stmt!=null) {
				stmt.close();
			}
			if(rs!=null) {
				rs.close();
			}
			
		}
		catch(Exception e) {
			logger.error("close all connections", e);
		}
		
	}

}
