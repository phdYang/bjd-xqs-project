package service;

import java.util.List;

import com.alibaba.fastjson.JSONArray;

import DAO.AlarmLogDAO;
import DAO.SensorDAO;
import Vo.SensorVo;
import model.AlarmStd;

public class AlarmLogService {
	
	public String getAllAlarmLog() {
		String json_str = "";
		AlarmLogDAO ald = new AlarmLogDAO();
		List<AlarmStd> list = ald.getAllAlarmLog();
		json_str = JSONArray.toJSONString(list);
		return json_str;
	}
	
	public String getAllAlarmLog(int page,int rows){
		String rtn = "{'total':0,'rows':[ ]}" ;
		AlarmLogDAO ald = new AlarmLogDAO();
		int total = ald.getAlarmLogTotal();
		if(total>0){
			List<SensorVo> list = ald.getAllAlarmLog(page, rows);
			String json_str = JSONArray.toJSONString(list);
			rtn =  "{\"total\":"+total+",\"rows\":"+json_str+"}" ;
		}
		return rtn;
	}
}
