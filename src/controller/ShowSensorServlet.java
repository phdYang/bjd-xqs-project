package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Vo.SensorVo;
import service.SensorService;

/**
 * Servlet implementation class ShowSensorServlet
 */
@WebServlet("/showSensorServlet")
public class ShowSensorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowSensorServlet() {
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
        String typeId = request.getParameter("typeId");
        String targetId = request.getParameter("targetId");
        String sectionId = request.getParameter("sectionId");
        String rows = request.getParameter("rows");
        String page = request.getParameter("page");
        //System.out.println(typeId+","+targetId+","+sectionId);
        if(typeId !=null || targetId!=null || sectionId!=null) {
        	if("".equals(typeId)) {
        		typeId = "0";
        	}
        	if("".equals(targetId)) {
        		targetId = "0";
        	}
        	if("".equals(sectionId)) {
        		sectionId = "0";
        	}
        	//System.out.println("cnm "+typeId+","+targetId+","+sectionId);
        	if(page != null && rows != null){
                int rowss = Integer.parseInt(rows);
                int pagess = Integer.parseInt(page);
                int typeIds = Integer.parseInt(typeId);
                int targetIds = Integer.parseInt(targetId);
                int sectionIds = Integer.parseInt(sectionId);
                String json_list = new SensorService().getSensorVo(pagess, rowss,typeIds,targetIds,sectionIds);
                System.out.println(json_list);
                response.getWriter().write(json_list) ;
            }else{
            	response.getWriter().write("{total:0,rows:[]}") ;
            }
        }else {
        	if(page != null && rows != null){
                int rowss = Integer.parseInt(rows) ;
                int pagess = Integer.parseInt(page) ;
                String json_list = new SensorService().getSensorVo(pagess, rowss);
                //System.out.println(json_list);
                response.getWriter().write(json_list) ;
            }else{
            	response.getWriter().write("{total:0,rows:[]}") ;
            }
        }
        
 	}

}
