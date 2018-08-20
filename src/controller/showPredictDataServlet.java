package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.MonitorDataService;
import service.PredictDataService;
import utils.DateUtilsMy;

/**
 * Servlet implementation class showPredictDataServlet
 */
@WebServlet("/showPredictDataServlet")
public class showPredictDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public showPredictDataServlet() {
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
        int sensorId = Integer.parseInt(request.getParameter("sensorId"));
        int predictTime = Integer.parseInt(request.getParameter("predictTime"));
       // System.out.println(sensorId+","+predictTime);
        String today = DateUtilsMy.getCurrentTiem();
        
        String startDate = today;
        String endDate = DateUtilsMy.addDay(startDate, predictTime);
       
        String json_data = new PredictDataService().getPredictDataVo(startDate, endDate, sensorId);
        //System.out.println(json_data);
        response.getWriter().write(json_data);
	}

}
