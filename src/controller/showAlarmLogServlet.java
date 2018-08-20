package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.AlarmLogService;
import service.AlarmStdService;
import service.SensorService;

/**
 * Servlet implementation class showAlarmLogServlet
 */
@WebServlet("/showAlarmLogServlet")
public class showAlarmLogServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public showAlarmLogServlet() {
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
        //System.out.println(1);
        String rows = request.getParameter("rows");
        String page = request.getParameter("page");
        if(page != null && rows != null){
            int rowss = Integer.parseInt(rows);
            int pagess = Integer.parseInt(page);
            String json_list = new AlarmLogService().getAllAlarmLog(pagess, rowss);
            response.getWriter().write(json_list);
        }else{
        	response.getWriter().write("{total:0,rows:[]}") ;
        }
        
	}

}
