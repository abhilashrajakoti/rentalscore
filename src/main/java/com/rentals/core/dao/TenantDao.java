package com.rentals.core.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.apache.log4j.Logger;

import com.rentals.core.beans.Tenant;
import com.rentals.core.utils.DBUtils;

public class TenantDao {
	private static final Logger logger=Logger.getLogger("TenantDao.class");
	
	public boolean createTenant(Tenant t) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=DBUtils.getConnection();
			String insertQuery="INSERT INTO Tenant(aadhaarno, first_name, miidle_name, last_name) VALUES (?, ?, ?, ?)";
			pstmt=conn.prepareStatement(insertQuery);
			pstmt.setString(1, t.getAadhaarno());
			pstmt.setString(2, t.getFirst_name());
			pstmt.setString(3, t.getMiddle_name());
			pstmt.setString(4, t.getLast_name());
			int resultCount=pstmt.executeUpdate();
			if(resultCount>0)
				return true;
			else
				return false;
			
		}
		catch(Exception e) {
			logger.error("CreateTenant error", e);
		}
		finally {
			DBUtils.closeAllDbConnections(conn,pstmt,rs);
		}
		return false;
	}

}
