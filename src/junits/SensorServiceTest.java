package junits;

import static org.junit.Assert.*;

import org.junit.Test;

import service.SensorService;

public class SensorServiceTest {

	@Test
	public void testGetSensorTypeVo() {
		SensorService ss = new SensorService();
		System.out.println(ss.getSensorVo(1, 10, 0, 0, 0));
	}
	
}
