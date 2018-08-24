package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.MonitorDataService;
import service.SensorService;
import utils.DateUtilsMy;

/**
 * Servlet implementation class showMonitodataServlet
 */
@WebServlet("/showMonitodataServlet")
public class showMonitodataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public showMonitodataServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        String[] sensorIds = request.getParameterValues("sensorId");
        //System.out.println(tst.length);
        //int sensorId = Integer.parseInt(request.getParameter("sensorId"));
        String starDate = request.getParameter("starDate");
        String endDate = request.getParameter("endDate");
        //以下两行，为了伪造一个2018年的假数据，当界面选择2018时，实际上去查的是2017的数据库
        String sd = DateUtilsMy.addYear2(starDate, -1);
        String ed = DateUtilsMy.addYear2(endDate, -1);
        //System.out.println(sensorId+","+starDate+","+endDate);
        int sensorId = 0;
        String js_rs = "[";
        for (int i = 0; i < sensorIds.length; i++) {
        	//System.out.println(sensorIds[i]);
        	sensorId = Integer.parseInt(sensorIds[i]);
        	String json_data = new MonitorDataService().getMonitorDataVo(sd, ed, sensorId);
        	//System.out.println(json_data);
        	String sensorName = new SensorService().getSensorNameById(sensorId);
        	js_rs += "{";
        	js_rs += "\""+sensorName+"\":"+json_data+"";
            js_rs +="}";
            if(i!=sensorIds.length-1) {
            	js_rs +=",";
            }
		}
        js_rs+="]";
        System.out.println(js_rs);
        response.getWriter().write(js_rs);
	}

}
