package service;

import java.util.List;

import com.alibaba.fastjson.JSONArray;

import DAO.MonitorDataDAO;
import Vo.MonitorDataVo;

public class MonitorDataService {
	
	public String getMonitorDataVo(String startDate,String endDate,int sensorId){
		MonitorDataDAO md = new MonitorDataDAO();
		List<MonitorDataVo> list = md.getMonitorDataVo(startDate, endDate, sensorId);
		String json_rs = JSONArray.toJSONString(list);
		return json_rs;
	}
}
