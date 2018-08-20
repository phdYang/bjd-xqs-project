package service;

import java.util.List;
import com.alibaba.fastjson.JSONArray;

import DAO.AlarmStdDAO;
import model.AlarmStd;

public class AlarmStdService {
	
	public String getAllAlarmStd() {
		String json_str = "";
		AlarmStdDAO asd = new AlarmStdDAO();
		List<AlarmStd> list = asd.getAllAlarmStd();
		json_str = JSONArray.toJSONString(list);
		return json_str;
	}

}
