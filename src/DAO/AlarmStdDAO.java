package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Vo.SensorVo;
import model.AlarmStd;
import utils.BaseDAO;

public class AlarmStdDAO {
	
	/**
	 * 返回阈值建议表
	 * @return
	 */
	public List getAllAlarmStd() {
		List<AlarmStd> asList = new ArrayList<AlarmStd>();
 		Connection conn = BaseDAO.getConn();
		String sql = "SELECT * FROM t_alarm_std";
		try {
			PreparedStatement preStat = conn.prepareStatement(sql);
			ResultSet rs = preStat.executeQuery();
			while(rs.next()){
				AlarmStd as = new AlarmStd();
				as.setId(rs.getInt(1));
				as.setDesc(rs.getString(3));
				as.setMean(rs.getDouble(4));
				as.setDev(rs.getDouble(5));
				as.setMin(rs.getDouble(6));
				as.setMax(rs.getDouble(7));
				asList.add(as);
			}
			//BaseDAO.ColseAll(rs, preStat, conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return asList;
	}

}
