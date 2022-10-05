package com.shelley.dao.impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.shelley.dao.DailyRecordDao;
import com.shelley.entity.DailyRecord;
import com.shelley.utils.JDBCUtils;
import com.shelley.entity.User;

public class DailyRecordDaoImpl implements DailyRecordDao {
	
	public boolean login(User user){
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			conn = JDBCUtils.getConnection();
			pst = conn.prepareStatement("select username from users where username=?");
			pst.setString(1, user.getUsername());
			rs = pst.executeQuery();
			if(rs.next()){
				if(psd(user)){
					return true;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCUtils.close(conn, pst, rs);
		}
		return false;
	}
	
	public boolean psd(User user){
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			conn = JDBCUtils.getConnection();
			pst = conn.prepareStatement("select password from users where username=?");
			pst.setString(1, user.getUsername());
			rs = pst.executeQuery();
			if(rs.next()){
				String psd=rs.getString(1);
				if(psd.equals(user.getPassword())){
					return true;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCUtils.close(conn, pst, rs);
		}
		return false;
	}
	
	public void save(DailyRecord record) {

		Connection conn = null;
		PreparedStatement pst = null;

		try {
			conn = JDBCUtils.getConnection();

			pst = conn.prepareStatement("insert into DailyRecord values(0,?,?,?)");

			pst.setString(1, record.getTitle());
			pst.setString(2, record.getContent());
			pst.setString(3, record.getTime());

			int row = pst.executeUpdate();
			System.out.println(row);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCUtils.close(conn, pst, null);
		}
	}

	public void delete(Integer id) {
		Connection conn = null;
		PreparedStatement pst = null;
		try {
			conn = JDBCUtils.getConnection();

			pst = conn.prepareStatement("delete from DailyRecord where id = ?");

			pst.setInt(1, id);

			int row = pst.executeUpdate();
			System.out.println(row);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCUtils.close(conn, pst, null);
		}
	}

	public void update(DailyRecord record) {
		Connection conn = null;
		PreparedStatement pst = null;

		try {
			conn = JDBCUtils.getConnection();

			pst = conn.prepareStatement("update DailyRecord set title=?,content=?,time=? where id = ? ");

			pst.setString(1, record.getTitle());
			pst.setString(2, record.getContent());
			pst.setString(3, record.getTime());
			pst.setInt(4, record.getId());
			int row = pst.executeUpdate();
			System.out.println(row);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCUtils.close(conn, pst, null);
		}
	}

	public DailyRecord findById(Integer id) {
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			conn = JDBCUtils.getConnection();

			pst = conn.prepareStatement("select * from DailyRecord where id = ?");

			pst.setInt(1, id);

			rs = pst.executeQuery();
			DailyRecord record = null;
			if (rs.next()) {
				record = new DailyRecord(id, rs.getString(2), rs.getString(3),rs.getString(4));

				return record;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCUtils.close(conn, pst, rs);
		}
		return null;
	}

	public List<DailyRecord> findAll() {
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			conn = JDBCUtils.getConnection();

			pst = conn.prepareStatement("select * from DailyRecord");

			rs = pst.executeQuery();
			DailyRecord record = null;
			List<DailyRecord> list = new ArrayList<>();
			while (rs.next()) {
				record = new DailyRecord(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getString(4));
				list.add(record);
			}
			if (list.size() > 0) {

				return list;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCUtils.close(conn, pst, rs);
		}
		return null;
	}

}
