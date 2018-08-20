package service;

import java.util.List;

import com.alibaba.fastjson.JSONArray;

import DAO.MonitorDataDAO;
import DAO.PredictDataDAO;
import Vo.MonitorDataVo;
import utils.DateUtilsMy;

public class PredictDataService {
	
	/**
	 * 
	 * @param startDate
	 * @param endDate
	 * @param sensorId
	 * @return
	 */
	public String getPredictDataVo(String startDate,String endDate,int sensorId){
		PredictDataDAO pdd = new PredictDataDAO();
		 //以下数据是模拟数据
        String startDateFail = DateUtilsMy.addYear(startDate, -2);
        String endDateFial = DateUtilsMy.addYear(endDate, -2);
        //System.out.println(startDateFail + ","+endDateFial);
		List<MonitorDataVo> list = pdd.getPredictDataVo(startDateFail, endDateFial, sensorId);
		String json_rs = JSONArray.toJSONString(list);
		return json_rs;
	}
}
