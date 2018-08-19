package junits;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import DAO.SensorDAO;

public class SensorDAOTest {

	@Test
	public void testGetSensorVoIntInt() {
		SensorDAO sd = new SensorDAO();
		List list = sd.getSensorVo(1,10);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	@Test
	public void testGetSensorTotal() {
		SensorDAO sd = new SensorDAO();
		int total = sd.getSensorTotal(0,0,0);
		System.out.println(total);
	}

	@Test
	public void testGetSensorVo() {
		SensorDAO sd = new SensorDAO();
		List list = sd.getSensorVo(1,10,0,0,0);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	@Test
	public void testGetAllSensorTypeVo() {
		SensorDAO sd = new SensorDAO();
		List list = sd.getAllSensorTypeVo();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	@Test
	public void testGetAllSensorTarget() {
		SensorDAO sd = new SensorDAO();
		List list = sd.getAllSensorLocationSection();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
