package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.AlarmLog;
import utils.BaseDAO;

public class AlarmLogDAO {
	
	/**
	 * 返回所有报警信息
	 * @return
	 */
	public List getAllAlarmLog() {
		List<AlarmLog> alList = new ArrayList<AlarmLog>();
 		Connection conn = BaseDAO.getConn();
		String sql = "SELECT SeqId,AlarmCode,AlarmLevel,AlarmSource,AlarmDate,AlarmContent FROM t_log_alarm_before";
		try {
			PreparedStatement preStat = conn.prepareStatement(sql);
			ResultSet rs = preStat.executeQuery();
			while(rs.next()){
				AlarmLog al = new AlarmLog();
				al.setSeqId(rs.getInt(1));
				al.setAlarmCode(rs.getInt(2));
				al.setAlarmLevel(rs.getInt(3));
				al.setAlarmSource(rs.getString(4));
				al.setAlarmDate(rs.getString(5));
				al.setAlarmContent(rs.getString(6));
				alList.add(al);
			}
			//BaseDAO.ColseAll(rs, preStat, conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return alList;
	}
	/**
	 * 返回所有报警信息
	 * @return
	 */
	public List getAllAlarmLog(int page,int rows) {
		List<AlarmLog> alList = new ArrayList<AlarmLog>();
 		Connection conn = BaseDAO.getConn();
 		int n = (page-1)*rows;
 		int m = rows;
		String sql = "SELECT SeqId,AlarmCode,AlarmLevel,AlarmSource,AlarmDate,AlarmContent FROM t_log_alarm_before"
				+ " limit ?,? ";
		try {
			PreparedStatement preStat = conn.prepareStatement(sql);
			preStat.setInt(1, n);
			preStat.setInt(2, m);
			ResultSet rs = preStat.executeQuery();
			while(rs.next()){
				AlarmLog al = new AlarmLog();
				al.setSeqId(rs.getInt(1));
				al.setAlarmCode(rs.getInt(2));
				al.setAlarmLevel(rs.getInt(3));
				al.setAlarmSource(rs.getString(4));
				al.setAlarmDate(rs.getString(5));
				al.setAlarmContent(rs.getString(6));
				alList.add(al);
			}
			//BaseDAO.ColseAll(rs, preStat, conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return alList;
	}
	/**
	 *返回所有报警历史总数 
	 * @return
	 */
	public int getAlarmLogTotal(){
		int total = 0;
 		Connection conn = BaseDAO.getConn();
		String sql = "SELECT count(*) FROM t_log_alarm_before";
		try {
			PreparedStatement preStat = conn.prepareStatement(sql);

			ResultSet rs = preStat.executeQuery();
			while(rs.next()){
				total = rs.getInt(1);
			}
			//BaseDAO.ColseAll(rs, preStat, conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return total;
	}
}
