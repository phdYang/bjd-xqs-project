package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtilsMy {

	/**
	 * 获得系统当前时间 yyyy-MM-dd HH:mm:ss
	 * @return
	 */
	public static String getCurrentTiem() {
		String currentTime = "";
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		currentTime = sdf.format(d);
		return currentTime;
	}
	
	/**
	 * 将指定日期加指定天数
	 * @param currentTime
	 * @param day
	 * @return
	 */
	public static String addDay(String currentTime,int day) {
		String endTime = "";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date cd = null;
		try {
			cd = sdf.parse(currentTime);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
        Calendar c = Calendar.getInstance();
        c.setTime(cd);
        c.add(Calendar.DATE, day);
 
        Date  ed = c.getTime();
        endTime = sdf.format(ed);
		return endTime;
	}
	
	public static String addYear(String currentTime,int year) {
		String endTime = "";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date cd = null;
		try {
			cd = sdf.parse(currentTime);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
        Calendar c = Calendar.getInstance();
        c.setTime(cd);
        c.add(Calendar.YEAR, year);
 
        Date  ed = c.getTime();
        endTime = sdf.format(ed);
		return endTime;
	}
	
	public static String addYear2(String currentTime,int year) {
		String endTime = "";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date cd = null;
		try {
			cd = sdf.parse(currentTime);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
        Calendar c = Calendar.getInstance();
        c.setTime(cd);
        c.add(Calendar.YEAR, year);
 
        Date  ed = c.getTime();
        endTime = sdf.format(ed);
		return endTime;
	}
	
	public static void main(String[] args) {
		System.out.println("今天："+DateUtilsMy.getCurrentTiem());
		System.out.println("今天加一天："+DateUtilsMy.addDay(DateUtilsMy.getCurrentTiem(), 1));
		System.out.println("今天加一年："+DateUtilsMy.addYear(DateUtilsMy.getCurrentTiem(), 1));
	}
}
