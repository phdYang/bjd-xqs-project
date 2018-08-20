package junits;

import static org.junit.Assert.*;

import org.junit.Test;

import service.AlarmLogService;

public class AlarmLogServiceTest {

	@Test
	public void testGetAllAlarmLog() {
		AlarmLogService als = new AlarmLogService();
		System.out.println(als.getAllAlarmLog(1,10));
	}

}
