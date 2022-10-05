package leslie.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import leslie.beans.User;
import leslie.utils.JDBCUtils;

public class UsersDao {
	public boolean login(User user) {
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			conn = JDBCUtils.getConnection();
			pst = conn.prepareStatement("select * from users where username=?");
			pst.setString(1, user.getUsername());
			rs = pst.executeQuery();

			rs.next();
			String result = rs.getString("username");

			if (result.equals(user.getUsername())) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.close(conn, pst, rs);
		}
		return false;
	}
}
