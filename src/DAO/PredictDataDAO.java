package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Vo.MonitorDataVo;
import utils.BaseDAO;

/**
 * 目前这个预测模型还没实质性的功能
 * @author zhaoyang
 *
 */
public class PredictDataDAO {
	
	/**
	 * 
	 *  预测值（目前预测值来源于2016年的数据库）
	 *  
	 * @param startDate  开始日期(2017-01-01 00:00:00)
	 * @param endDate    结束日期(2017-11-18 01:00:06)
	 * @param sensorId   指定传感器
   	 * @return  返回一个valuelist
   	 * 
	 */
	public List getPredictDataVo(String startDate,String endDate,int sensorId){
		List<MonitorDataVo> mvList = new ArrayList<MonitorDataVo>();
 		Connection conn = BaseDAO.getConn();
		String sql = "select MonitorValue,MonitorDate "
				+ "from t_monitordata_origin2016 "
				+ "where "
				+ "MonitorDate >= ? and MonitorDate <= ? "
				+ "and SensorId = ? ";
		try {
			PreparedStatement preStat = conn.prepareStatement(sql);
			preStat.setString(1,startDate);
			preStat.setString(2,endDate);
			preStat.setInt(3,sensorId);
			ResultSet rs = preStat.executeQuery();
			while(rs.next()){
				MonitorDataVo mv = new MonitorDataVo();
				mv.setMonitorValue(rs.getDouble(1));
				mv.setMonitorDate(rs.getString(2));
				mvList.add(mv);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mvList;
	}

}
