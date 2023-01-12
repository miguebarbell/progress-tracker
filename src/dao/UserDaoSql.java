package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.ConnectionManager;

public class UserDaoSql implements UserDao{
	
	private Connection conn = ConnectionManager.getConnection();

	@Override
	public User getUsername(String username) {
		
		try( PreparedStatement pstmt = conn.prepareStatement("select * from users where username = ?")){
			
			pstmt.setString(2, username);
			
			ResultSet rs = pstmt.executeQuery();
			User user = null;
			
			if(rs.next()) {
				int user_id = rs.getInt("user_id");
				String usname = rs.getString("username");
				String password = rs.getString("password");
				
				user = new User(user_id, usname, password);
				
			}
			
			rs.close();
			// use getter for the username 
			return user;
			
		} catch (SQLException e) {
			System.out.println("Could not find username");
		}
		
		return null;
	}

	@Override
	public User getUserId(int u_id) {
		
  try( PreparedStatement pstmt = conn.prepareStatement("select * from users where user_id = ?")){
			
			pstmt.setInt(1, u_id);
			
			ResultSet rs = pstmt.executeQuery();
			User user = null;
			
			if(rs.next()) {
				int user_id = rs.getInt("user_id");
				String usname = rs.getString("username");
				String password = rs.getString("password");
				
				user = new User(user_id, usname, password);
				
			}
			
			rs.close();
			// use getter for the username 
			return user;
			
		} catch (SQLException e) {
			System.out.println("Could not find user id" + u_id);
		}
		
		return null;
	}
	
	

}
