package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Vo.SensorTypeVo;
import Vo.SensorVo;
import model.SensorItem;
import model.SensorLocationSection;
import model.SensorTarget;
import utils.BaseDAO;

public class SensorDAO {
	
	/**
	 *  所有的传感器
	 * @return 传感器总数
	 */
	public List getSensorVo(){
		List<SensorVo> svList = new ArrayList<SensorVo>();
 		Connection conn = BaseDAO.getConn();
		String sql = "SELECT SensorId,SensorName FROM t_sensor";
		try {
			PreparedStatement preStat = conn.prepareStatement(sql);
			ResultSet rs = preStat.executeQuery();
			while(rs.next()){
				SensorVo sv = new SensorVo();
				sv.setSensorId(rs.getInt(1));
				sv.setSensorName(rs.getString(2));
				svList.add(sv);
			}
			//BaseDAO.ColseAll(rs, preStat, conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return svList;
	}
	/**
	 * 按照传感器类型查询传感器
	 * @param itemId
	 * @return
	 */
	public List getSensorVo(int itemId){
		List<SensorVo> svList = new ArrayList<SensorVo>();
 		Connection conn = BaseDAO.getConn();
		String sql = "SELECT SensorId,SensorName FROM t_sensor WHERE SensorItemId = ?";
		try {
			PreparedStatement preStat = conn.prepareStatement(sql);
			preStat.setInt(1, itemId);
			ResultSet rs = preStat.executeQuery();
			while(rs.next()){
				SensorVo sv = new SensorVo();
				sv.setSensorId(rs.getInt(1));
				sv.setSensorName(rs.getString(2));
				svList.add(sv);
			}
			//BaseDAO.ColseAll(rs, preStat, conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return svList;
	}
	/**
	 * 分页获取传感器表的id和传感器姓名
	 * @return 传感器列表
	 * @problems  这里有个问题是，模拟数据的不完整，造成分页的不完整
	 */
	public List getSensorVo(int page,int rows){
		List<SensorVo> svList = new ArrayList<SensorVo>();
 		Connection conn = BaseDAO.getConn();
 		int n = (page-1)*rows;
 		int m = rows;
		String sql = "SELECT a.SensorId,a.SensorName,b.TypeName,c.targetName,d.sectionName "
				+ "FROM t_sensor a,t_sensor_type b ,t_sensor_target c,t_location_section d "
				+ "where a.TypeId = b.TypeId and a.sectionId = d.sectionId and a.targetId = c.targetId "
				+ "limit ?,?";
		try {
			PreparedStatement preStat = conn.prepareStatement(sql);
			preStat.setInt(1, n);
			preStat.setInt(2, m);
			ResultSet rs = preStat.executeQuery();
			while(rs.next()){
				SensorVo sv = new SensorVo();
				sv.setSensorId(rs.getInt(1));
				sv.setSensorName(rs.getString(2));
				sv.setSensorTypeName(rs.getString(3));
				sv.setSensorTargetName(rs.getString(4));
				sv.setSensorLocationSectionName(rs.getString(5));
				sv.setSensorClass("光纤光栅");
				svList.add(sv);
			}
			//BaseDAO.ColseAll(rs, preStat, conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return svList;
	}
	
	/**
	 * 返回条件查询的传感器
	 * @param page
	 * @param rows
	 * @param typeId
	 * @param targetId
	 * @param sectionId
	 * @return
	 */
	public List getSensorVo(int page,int rows,int typeId,int targetId,int sectionId){
		List<SensorVo> svList = new ArrayList<SensorVo>();
 		Connection conn = BaseDAO.getConn();
 		int n = (page-1)*rows;
 		int m = rows;
		String sql = "SELECT a.SensorId,a.SensorName,b.TypeName,c.targetName,d.sectionName "
				+ "FROM t_sensor a,t_sensor_type b,t_sensor_target c,t_location_section d "
				+ "where a.TypeId = b.TypeId and a.sectionId = d.sectionId and a.targetId = c.targetId ";
		
		if(typeId!=0) {
			sql+=" and a.typeId = "+typeId;
		}
		if(targetId!=0) {
			sql+=" and a.targetId = "+targetId;
		}
		if(sectionId!=0) {
			sql+=" and a.sectionId = "+sectionId;
		}
		sql+=" limit ?,?";
		//System.out.println(sql);
		try {
			PreparedStatement preStat = conn.prepareStatement(sql);
			preStat.setInt(1, n);
			preStat.setInt(2, m);
			ResultSet rs = preStat.executeQuery();
			while(rs.next()){
				SensorVo sv = new SensorVo();
				sv.setSensorId(rs.getInt(1));
				sv.setSensorName(rs.getString(2));
				sv.setSensorTypeName(rs.getString(3));
				sv.setSensorTargetName(rs.getString(4));
				sv.setSensorLocationSectionName(rs.getString(5));
				sv.setSensorClass("光纤光栅");
				svList.add(sv);
			}
			//BaseDAO.ColseAll(rs, preStat, conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return svList;
	}
	
	
	/**
	 * 计算传感器总数
	 * @return 返回传感器的总条数
	 */
	public int getSensorTotal(){
		int total = 0;
 		Connection conn = BaseDAO.getConn();
		String sql = "SELECT count(*) FROM t_sensor";
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
	
	/**
	 *  计算条件选择之后的传感器的数量
	 * @param typeId
	 * @param targetId
	 * @param sectionId
	 * @return
	 */
	public int getSensorTotal(int typeId,int targetId,int sectionId){
		int total = 0;
 		Connection conn = BaseDAO.getConn();
		String sql = "SELECT count(*) FROM t_sensor where 1=1 ";
		if(typeId!=0) {
			sql+=" and typeId = "+typeId;
		}
		if(targetId!=0) {
			sql+=" and targetId = "+targetId;
		}
		if(sectionId!=0) {
			sql+=" and sectionId = "+sectionId;
		}
		try {
			//System.out.println(sql);
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
	
	/**
	 * 返回所有传感器的类别
	 * @return 传感器类别列表list[SensorTypeVo]
	 */
	public List getAllSensorTypeVo() {
		List<SensorTypeVo> stvList = new ArrayList<SensorTypeVo>();
 		Connection conn = BaseDAO.getConn();
		String sql = "SELECT TypeId,TypeName,Unit FROM t_sensor_type";
		try {
			PreparedStatement preStat = conn.prepareStatement(sql);
			ResultSet rs = preStat.executeQuery();
			while(rs.next()){
				SensorTypeVo stv = new SensorTypeVo();
				stv.setTypeId(rs.getInt(1));
				stv.setTypeName(rs.getString(2));
				stv.setUnit(rs.getString(3));
				stvList.add(stv);
			}
			//BaseDAO.ColseAll(rs, preStat, conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stvList;
	}
	
	/**
	 * 返回所有检测对象类别
	 * @return
	 */
	public List getAllSensorTarget() {
		List<SensorTarget> stgList = new ArrayList<SensorTarget>();
 		Connection conn = BaseDAO.getConn();
		String sql = "SELECT * FROM t_sensor_target";
		try {
			PreparedStatement preStat = conn.prepareStatement(sql);
			ResultSet rs = preStat.executeQuery();
			while(rs.next()){
				SensorTarget stg = new SensorTarget();
				stg.setTargetId(rs.getInt(1));
				stg.setTargetName(rs.getString(2));
				stg.setIsValid(rs.getInt(3));
				stgList.add(stg);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stgList;
	}

	/**
	 * 返回所有传感器位置
	 * @return
	 */
	public List getAllSensorLocationSection() {
		List<SensorLocationSection> slsList = new ArrayList<SensorLocationSection>();
 		Connection conn = BaseDAO.getConn();
		String sql = "SELECT * FROM t_location_section";
		PreparedStatement preStat = null;
		ResultSet rs = null;
		try {
			preStat = conn.prepareStatement(sql);
			rs = preStat.executeQuery();
			while(rs.next()){
				SensorLocationSection sls = new SensorLocationSection();
				sls.setSectionId(rs.getInt(1));
				sls.setSectionName(rs.getString(2));
				sls.setIsValid(rs.getInt(3));
				slsList.add(sls);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return slsList;
	}
	/**
	 * 根据id获取特定传感器名称
	 * @param sensorId
	 * @return
	 */
	public String getSensorNameById(int sensorId) {
		String sensorName = "";
 		Connection conn = BaseDAO.getConn();
		String sql = "SELECT SensorName FROM t_sensor WHERE SensorId = ?";
		try {
			PreparedStatement preStat = conn.prepareStatement(sql);
			preStat.setInt(1, sensorId);
			ResultSet rs = preStat.executeQuery();
			while(rs.next()){
				sensorName = rs.getString(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sensorName;
	}
	
	public List getSensorItem() {
		List<SensorItem> siList = new ArrayList<SensorItem>();
 		Connection conn = BaseDAO.getConn();
		String sql = "SELECT ItemId,ItemName FROM t_sensor_item";
		PreparedStatement preStat = null;
		ResultSet rs = null;
		try {
			preStat = conn.prepareStatement(sql);
			rs = preStat.executeQuery();
			while(rs.next()){
				SensorItem si = new SensorItem();
				si.setItemId(rs.getInt(1));
				si.setItemName(rs.getString(2));
				siList.add(si);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return siList;
	}
}
